package es.um.demo.drools_cli;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerStatus;
import org.kie.server.api.model.KieScannerStatus;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.controller.api.model.spec.*;
import org.kie.server.controller.client.KieServerControllerClient;
import org.kie.server.controller.client.KieServerControllerClientFactory;

import es.um.demo.models.data.ContainerJSON;

public class DroolsClient {

  private static final String URL = "http://business-central:8080/business-central/rest/controller";
  private static final String USER = "admin";
  private static final String PASSWORD = "admin";

    private KieServerControllerClient client;

//    public static void main(String[] args) {
//        KieServerControllerClient client = KieServerControllerClientFactory.newRestClient(URL, USER, PASSWORD, MarshallingFormat.JSON);
//        // Create server template and KIE container, start and stop KIE container, and delete server template
//        ServerTemplate serverTemplate = createServerTemplate();
//        ContainerSpec container = createContainer(serverTemplate);
//        client.startContainer(container);
//        client.stopContainer(container);
//        client.deleteServerTemplate(serverTemplate.getId());
//    }
    
    private static DroolsClient dc;
    
	   private DroolsClient() {
	      // constructor of the SingletonExample class
	   }

	   public static DroolsClient getInstance() {
	      // write code that allows us to create only one object
	      // access the object as per our need
		   if(dc == null) {
		         dc = new DroolsClient();
		      }

		       // returns the singleton object
		       return dc;
	   }

    // Re-create and configure server template
    public ServerTemplate createServerTemplate(String templateId, String templateName) {
        ServerTemplate serverTemplate = new ServerTemplate();
        serverTemplate.setId(templateId);
        serverTemplate.setName(templateName);
        serverTemplate.setCapabilities(Arrays.asList(Capability.PROCESS.name(), Capability.RULE.name(), Capability.PLANNING.name()));

        client.saveServerTemplate(serverTemplate);

        return serverTemplate;
    }

    // Re-create and configure KIE containers
    public boolean createContainer(ContainerJSON containerJSON){
    	
        Map<Capability, ContainerConfig> containerConfigMap = new HashMap<>();

        ProcessConfig processConfig = new ProcessConfig("PER_PROCESS_INSTANCE", "kieBase", "kieSession", "MERGE_COLLECTION");
        containerConfigMap.put(Capability.PROCESS, processConfig);

        RuleConfig ruleConfig = new RuleConfig(500l, KieScannerStatus.SCANNING);
        containerConfigMap.put(Capability.RULE, ruleConfig);

        //ReleaseId releaseId = new ReleaseId("org.kie.server.testing", "stateless-session-kjar", "1.0.0-SNAPSHOT");
        ReleaseId releaseId = new ReleaseId(containerJSON.getReleaseIdgroupId(), containerJSON.getReleaseIdartifactId(), containerJSON.getReleaseIdversion());
        
        //ContainerSpec containerSpec = new ContainerSpec("example-container-id", "example-client-name", serverTemplate, releaseId, KieContainerStatus.STOPPED, containerConfigMap);
        ServerTemplate st = new ServerTemplate(containerJSON.getServerTemplate().getTemplateId(), containerJSON.getServerTemplate().getTemplateName());
        ContainerSpec containerSpec = new ContainerSpec(containerJSON.getContainerId(), containerJSON.getContainerName(), st, releaseId, KieContainerStatus.STOPPED, containerConfigMap);
        client.saveContainerSpec(st.getId(), containerSpec);

        //return containerSpec;
        return true;
    }
}