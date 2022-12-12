package es.um.demo.spring;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.demo.drools_cli.KieServerClient;
import es.um.demo.models.data.CapabilitiesJSON;
import es.um.demo.models.data.Item;
import es.um.demo.models.data.Mensaje;
import es.um.demo.models.data.PruebaJSON;
import es.um.demo.models.data.StatusMessage;

@RestController
@RequestMapping(value="/kie", produces="application/json")
public class KieServerController {

    @Autowired
    RulesService rulesService;
    
    /*
     * GET Kie Server capabilities
     */
    @GetMapping("/capabilities")
    public CapabilitiesJSON get_generico() { 
    	KieServerClient ksc = KieServerClient.getInstance();
        return ksc.listCapabilities();
    }
    
    /*
     * GET Kie Server contianers
     */
    @GetMapping("/containers")
    public PruebaJSON get_containers() { 
    	KieServerClient ksc = KieServerClient.getInstance();
        return ksc.listContainers();
    }
    
    /*
     * Recreate container from a given ID in url
     */
    @GetMapping("/recreate/{id}")
    public StatusMessage recreate(@PathVariable String id) { 
    	KieServerClient ksc = KieServerClient.getInstance();
    	boolean res = ksc.disposeAndRecreateContainer(id);
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Recreating container" + id);
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	return sm;
    }
    
    /*
     * GET info from container from a given ID in url
     */
    @GetMapping("/containers/{id}")
    public String get_container_id(@PathVariable String id) {
    	KieServerClient ksc = KieServerClient.getInstance();
    	String info = ksc.getContainerById(id);
        return info;
    }
    
    /*
     * POST a fact (in JSON) in a given container
     */
    @PostMapping("containers/{id}/fact")
    public String rules(@PathVariable String id, @RequestBody Item item) {
        //int fired = this.rulesService.fireRules(item);

        System.out.println(item.toString());
       // System.out.println("Number of rules fired" + fired);
        return item.toString();
    }
    
    @GetMapping("helloworld")
    public StatusMessage helloworld() {
    	KieServerClient ksc = KieServerClient.getInstance();
    	boolean res = ksc.sayHelloWorld();
    	StatusMessage sm = new StatusMessage();
    	sm.setMessage("Creating container helloworld");
    	if (res) {
    		sm.setStatus("OK");
    	}
    	else {
    		sm.setStatus("FAIL");
    	}
    	return sm;
    }
}