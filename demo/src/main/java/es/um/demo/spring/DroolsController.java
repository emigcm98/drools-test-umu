package es.um.demo.spring;

import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.demo.drools_cli.DroolsClient;
import es.um.demo.models.data.CapabilitiesJSON;
import es.um.demo.models.data.ContainerJSON;
import es.um.demo.models.data.DroolsShop;
import es.um.demo.models.data.ServerTemplateJSON;
import es.um.demo.models.data.StatusMessage;

@RestController
@RequestMapping(value="/drools", produces="application/json") 
public class DroolsController {

	@Autowired
    RulesService rulesService;
	
	private final String KSESSION_NAME = "ksession-rules";
 
    @GetMapping("container/create")
    public ContainerJSON get_container_id() {
    	ContainerJSON json_create_container = new ContainerJSON("es.um.testing", "prueba", "1.0.1-SNAPSHOT", "testing-container-id", "testing-container");
        //cj.setServerTemplate(new ServerTemplateJSON("template-id", "template-name"));
    	return json_create_container;
    }
    
    
    @PostMapping("container/create")
    public StatusMessage createContainer(@RequestBody ContainerJSON jsonContainer) {
        
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.createContainer(jsonContainer);
    	
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Create container");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	
    	return sm;
    }
    
    
    @PostMapping("template/create")
    public StatusMessage createTemplate(@RequestBody ServerTemplateJSON jsonServerTemplate) {
        
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.createServerTemplate(jsonServerTemplate);
    	
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Create container");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	
    	return sm;
    }
    
    @GetMapping("container/{templateid}/{containerid}/stop")
    public StatusMessage stopContainer(@PathParam String templateId, @PathParam String containerId) {
    	
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.stopContainer(templateId, containerId);
    	
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Stop container");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	
    	return sm;
    }
    
    @GetMapping("container/{templateid}/{containerid}/start")
    public StatusMessage startContainer(@PathParam String templateId, @PathParam String containerId) {
    	
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.startContainer(templateId, containerId);
    	
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Start container");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	
    	return sm;
    }
    
    @GetMapping("templates")
    public CapabilitiesJSON getTemplates() {
    	
    	DroolsClient dc = DroolsClient.getInstance();
    	
    	return dc.getTemplates();
    }
    
    @GetMapping("servers")
    public CapabilitiesJSON getServerInstances() {
    	
    	DroolsClient dc = DroolsClient.getInstance();
    	
    	return dc.getServerInstances();
    }
    
    // prueba
    @GetMapping("launch/container/{templateid}/{containerid}")
    public StatusMessage launchRules(@PathParam String templateId, @PathParam String containerId) {
    	
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.launch(templateId, containerId);
    	
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Launch rules!");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	
    	return sm;
    	
    }

}
