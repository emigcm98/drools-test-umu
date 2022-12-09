package es.um.demo.drools_cli;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.builder.model.KieBaseModel;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.server.api.marshalling.MarshallingFormat;
import org.kie.server.api.model.KieContainerStatus;
import org.kie.server.api.model.KieScannerStatus;
import org.kie.server.api.model.ReleaseId;
import org.kie.server.controller.api.KieServerController;
import org.kie.server.controller.api.model.runtime.ServerInstanceKey;
import org.kie.server.controller.api.model.runtime.ServerInstanceKeyList;
import org.kie.server.controller.api.model.spec.*;
import org.kie.server.controller.client.KieServerControllerClient;
import org.kie.server.controller.client.KieServerControllerClientFactory;
import org.kie.server.controller.client.exception.KieServerControllerHTTPClientException;

import es.um.demo.models.data.CapabilitiesJSON;
import es.um.demo.models.data.ContainerJSON;
import es.um.demo.models.data.ServerTemplateJSON;
import es.um.demo.models.data.DroolsShop.Customer;
import es.um.demo.models.data.DroolsShop.Product;
import es.um.demo.models.data.DroolsShop.Purchase;

public class DroolsClient {

	// private static final String URL =
	// "http://business-central:8080/business-central/rest/controller";
	private static final String URL = "http://localhost:8080/business-central/rest/controller";
	private static final String USER = "admin";
	private static final String PASSWORD = "admin";

	private static KieServerControllerClient client;
	private static DroolsClient dc;

	private static String templateIdDefault;
//    public static void main(String[] args) {
//        KieServerControllerClient client = KieServerControllerClientFactory.newRestClient(URL, USER, PASSWORD, MarshallingFormat.JSON);
//        // Create server template and KIE container, start and stop KIE container, and delete server template
//        ServerTemplate serverTemplate = createServerTemplate();
//        ContainerSpec container = createContainer(serverTemplate);
//        client.startContainer(container);
//        client.stopContainer(container);
//        client.deleteServerTemplate(serverTemplate.getId());
//    }

	private DroolsClient() {
		// constructor of the SingletonExample class
		initialize();
	}

	private void initialize() {
		client = KieServerControllerClientFactory.newRestClient(URL, USER, PASSWORD, MarshallingFormat.JSON);
		templateIdDefault = client.listServerTemplates().getServerTemplates()[0].getId();
	}

	public static DroolsClient getInstance() {
		// write code that allows us to create only one object
		// access the object as per our need
		if (dc == null) {
			dc = new DroolsClient();
		}

		// returns the singleton object
		return dc;
	}

	// Re-create and configure server template
	public boolean createServerTemplate(ServerTemplateJSON st) {

		String templateId = st.getTemplateId();
		String templateName = st.getTemplateName();
		ServerTemplate serverTemplate = new ServerTemplate();
		serverTemplate.setId(templateId);
		serverTemplate.setName(templateName);
		serverTemplate.setCapabilities(
				Arrays.asList(Capability.PROCESS.name(), Capability.RULE.name(), Capability.PLANNING.name()));

		client.saveServerTemplate(serverTemplate);

		return true;
	}

	// Re-create and configure KIE containers
	public boolean createContainer(ContainerJSON containerJSON) {

		Map<Capability, ContainerConfig> containerConfigMap = new HashMap<>();

		ProcessConfig processConfig = new ProcessConfig("PER_PROCESS_INSTANCE", "kieBase", "kieSession",
				"MERGE_COLLECTION");
		containerConfigMap.put(Capability.PROCESS, processConfig);

		RuleConfig ruleConfig = new RuleConfig(500l, KieScannerStatus.SCANNING);
		containerConfigMap.put(Capability.RULE, ruleConfig);

		// ReleaseId releaseId = new ReleaseId("org.kie.server.testing",
		// "stateless-session-kjar", "1.0.0-SNAPSHOT");
		ReleaseId releaseId = new ReleaseId(containerJSON.getReleaseIdgroupId(), containerJSON.getReleaseIdartifactId(),
				containerJSON.getReleaseIdversion());

		// ContainerSpec containerSpec = new ContainerSpec("example-container-id",
		// "example-client-name", serverTemplate, releaseId, KieContainerStatus.STOPPED,
		// containerConfigMap);
//		ServerTemplate st = new ServerTemplate(containerJSON.getServerTemplate().getTemplateId(),
//				containerJSON.getServerTemplate().getTemplateName());

		ServerTemplate st = client.getServerTemplate(templateIdDefault);
		if (st == null) {
			return false;
		}

		ContainerSpec containerSpec = new ContainerSpec(containerJSON.getContainerId(),
				containerJSON.getContainerName(), st, releaseId, KieContainerStatus.STOPPED, containerConfigMap);

		client.saveContainerSpec(st.getId(), containerSpec);

		// return containerSpec;
		return true;
	}

	public CapabilitiesJSON getTemplates() {

		final ServerTemplateList serverTemplateList = client.listServerTemplates();

		CapabilitiesJSON cj = new CapabilitiesJSON();
		List<String> templateIds = new LinkedList<>();

		for (ServerTemplate st : serverTemplateList.getServerTemplates()) {
			templateIds.add(st.getId());
		}
		cj.setCapabilities(templateIds);

		return cj;
	}

	public CapabilitiesJSON getServerInstances() {

		ServerInstanceKeyList instances = client.getServerInstances(templateIdDefault);

		CapabilitiesJSON cj = new CapabilitiesJSON();
		List<String> serverIds = new LinkedList<>();

		for (ServerInstanceKey instance : instances.getServerInstanceKeys()) {
			serverIds.add(instance.getServerName() + " | " + instance.getServerTemplateId());
		}

		cj.setCapabilities(serverIds);

		return cj;
	}

	public boolean startContainer(String templateId, String containerId) {

		ContainerSpec container = client.getContainerInfo(templateId, containerId);
		client.startContainer(container);

		return true;
	}

	public boolean stopContainer(String templateId, String containerId) {

		ContainerSpec container = client.getContainerInfo(templateId, containerId);
		client.stopContainer(container);

		return true;
	}

	// public static void launch(KieContainer kc) {
	public boolean launch(String templateId, String containerId) {
		
//		KieServices kieServices = KieServices.Factory.get();
//		KieBaseModel kbm = kieServices.newKieModuleModel().newKieBaseModel()
//				.addPackage("es.um.demo.rules");
		ContainerSpec container = null;
		try {
			container = client.getContainerInfo(templateId, containerId);
		}
		catch (KieServerControllerHTTPClientException e) {
			return false;
		}
		
		
		KieContainer kc = KieServices.Factory.get().newKieContainer(containerId, container.getReleasedId());
		
		
		KieSession ksession = kc.newKieSession("ksession-rules");

		Customer mark = new Customer("mark", 0);
		ksession.insert(mark);
		Product shoes = new Product("shoes", 60);
		ksession.insert(shoes);
		Product hat = new Product("hat", 60);
		ksession.insert(hat);

		ksession.insert(new Purchase(mark, shoes));
		FactHandle hatPurchaseHandle = ksession.insert(new Purchase(mark, hat));

		ksession.fireAllRules();
		ksession.delete(hatPurchaseHandle);

		System.out.println("Customer mark has returned the hat");

		ksession.fireAllRules();
		
		return true;
	}

}