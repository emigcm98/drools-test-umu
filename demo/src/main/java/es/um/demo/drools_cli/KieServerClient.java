package es.um.demo.drools_cli;

import java.util.List;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerResource;
import org.kie.server.api.model.KieContainerResourceList;
import org.kie.server.api.model.KieServerInfo;
import org.kie.server.api.model.ServiceResponse;
import org.kie.server.client.KieServicesClient;
import org.kie.server.client.KieServicesConfiguration;
import org.kie.server.client.KieServicesFactory;

public class KieServerClient {

	private static final String URL = "http://localhost:8180/kie-server/services/rest/server";
	private static final String USER = "admin";
	private static final String PASSWORD = "admin";
	 
	private static final MarshallingFormat FORMAT = MarshallingFormat.JSON;
	
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

	    conf.setMarshallingFormat(FORMAT);
	    kieServicesClient = KieServicesFactory.newKieServicesClient(conf);
	}
	
	public String listCapabilities() {

		  KieServerInfo serverInfo = kieServicesClient.getServerInfo().getResult();
		  
		  StringBuilder sb = new StringBuilder();
		  //System.out.print("Server capabilities:");

		  for (String capability : serverInfo.getCapabilities()) {
		   sb.append(capability + "\n");
		  }
		  
		  return sb.toString();
		}
	
	public String listContainers() {
	    KieContainerResourceList containersList = kieServicesClient.listContainers().getResult();
	    List<KieContainerResource> kieContainers = containersList.getContainers();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for (KieContainerResource container : kieContainers) {
	        sb.append("\t" + container.getContainerId() + " (" + container.getReleaseId() + ")");
	    }
	    
	    return sb.toString();
	}
	
	public String getContainerById(String id) {
		
		KieContainerResource container = kieServicesClient.getContainerInfo(id).getResult();
	    
	    StringBuilder sb = new StringBuilder();
	    
	    sb.append("\t" + container.getContainerId() + " (" + container.getReleaseId() + ")");
	    
	    
	    return sb.toString();
	}
}
