package es.um.demo.drools_cli;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.drools.modelcompiler.builder.KieBaseBuilder;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.KieContainerResourceList;
import org.kie.server.api.model.KieServerInfo;
import org.kie.server.api.model.KieServiceResponse.ResponseType;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;

import es.um.demo.models.data.CapabilitiesJSON;
import es.um.demo.models.data.Container;
import es.um.demo.models.data.PruebaJSON;

public class KieServerClient {

	//private static final String URL = "http://kie-server:8080/kie-server/services/rest/server";
	private static final String URL = "http://localhost:8180/kie-server/services/rest/server";
	private static final String USER = "kieserver";
	private static final String PASSWORD = "kieserver1!";
	 
	
	private static KieServicesConfiguration conf;
	private static KieServicesClient kieServicesClient;

	private static KieServerClient ksc;
    
	   private KieServerClient() {
	      // constructor of the SingletonExample class
		   initialize();
	   }

	   public static KieServerClient getInstance() {
	      // write code that allows us to create only one object
	      // access the object as per our need
		   if(ksc == null) {
		         ksc = new KieServerClient();
		      }

		       // returns the singleton object
		       return ksc;
	   }
	
	private void initialize() {
		conf = KieServicesFactory.newRestConfiguration(URL, USER, PASSWORD);

	    //If you use custom classes, such as Obj.class, add them to the configuration.
	    //Set<Class<?>> extraClassList = new HashSet<Class<?>>();
	    //extraClassList.add(Obj.class);
	    //conf.addExtraClasses(extraClassList);

	    conf.setMarshallingFormat(MarshallingFormat.JSON);
	    kieServicesClient = KieServicesFactory.newKieServicesClient(conf);
	}
	
	public CapabilitiesJSON listCapabilities() {

		  KieServerInfo serverInfo = kieServicesClient.getServerInfo().getResult();
		  
		  List<String> capabilities = new LinkedList<>();

		  for (String capability : serverInfo.getCapabilities()) {
			  capabilities.add(capability);
		  }
		  
		  CapabilitiesJSON cj = new CapabilitiesJSON();
		  cj.setCapabilities(capabilities);
		  
		  return cj;
		}
	
	
	public PruebaJSON listContainers() {
		
		
	    KieContainerResourceList containersList = kieServicesClient.listContainers().getResult();
	    List<KieContainerResource> kieContainers = containersList.getContainers();
	    
	    PruebaJSON pj = new PruebaJSON("containers");
	
	    for (KieContainerResource container : kieContainers) {
	        pj.addContainer(new Container(container.getContainerId(), container.getReleaseId().toString()));
	    }
	    
	    return pj;
	}
	
	public boolean disposeAndRecreateContainer(String id) {

	    // Retrieve list of KIE containers
	    List<KieContainerResource> kieContainers = kieServicesClient.listContainers().getResult().getContainers();
	    if (kieContainers.size() <= 0) {
	        return false;
	    }
	    
	    KieContainerResource container = null;
	    for (KieContainerResource c : kieContainers) {
	    	if (c.getContainerId() == id) {
	    		container = c;
	    	}
	    }
	    if (container == null) {
	    	return false;
	    }
	    
	    String containerId = container.getContainerId();
	    ServiceResponse<Void> responseDispose = kieServicesClient.disposeContainer(containerId);
	    
	    if (responseDispose.getType() == ResponseType.FAILURE) {
	        System.out.println("Error disposing " + containerId + ". Message: ");
	        System.out.println(responseDispose.getMsg());
	        return false;
	    }

	    // Re-create KIE container
	    ServiceResponse<KieContainerResource> createResponse = kieServicesClient.createContainer(containerId, container);
	    if(createResponse.getType() == ResponseType.FAILURE) {
	        System.out.println("Error creating " + containerId + ". Message: ");
	        System.out.println(responseDispose.getMsg());
	        return false;
	    }
	    
	    return true;
	}

	
	public String getContainerById(String id) {
		
		KieContainerResource container = kieServicesClient.getContainerInfo(id).getResult();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    sb.append("\t" + container.getContainerId() + " (" + container.getReleaseId() + ")");
	    
	    
	    return sb.toString();
	}
	
	public boolean sayHelloWorld() {
		
//		KieServices ks = KieServices.Factory.get();
//		KieContainer kc = ks.getKieClasspathContainer();
//		System.out.println(kc);
//		
//		KieSession ksession = kc.newKieSession("HelloWorldKS");
		
		
		
		
		KieContainerResource kcr = new KieContainerResource(new ReleaseId("es.um.demo", "helloworld", "1.0.1"));
		kcr.setContainerAlias("helloworld!");
		
		ServiceResponse<KieContainerResource> sr = kieServicesClient.createContainer("helloworld-id", kcr);
		if (sr.getType() == ResponseType.SUCCESS) {
			return true;
		}
		else {
			System.out.println(sr.getMsg());
			return false;
		}
	}
	
}
