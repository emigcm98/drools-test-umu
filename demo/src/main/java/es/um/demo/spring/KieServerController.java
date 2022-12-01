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

@RestController
@RequestMapping(value="/kie", produces="application/json")
public class KieServerController {

    @Autowired
    RulesService rulesService;
    
    
    @GetMapping("/capabilities")
    public CapabilitiesJSON get_generico() { 
    	KieServerClient ksc = KieServerClient.getInstance();
        return ksc.listCapabilities();
    }
    
    @GetMapping("/containers")
    public PruebaJSON get_containers() { 
    	KieServerClient ksc = KieServerClient.getInstance();
        return ksc.listContainers();
    }
    
    @GetMapping("/recreate/{id}")
    public String recreate(@PathVariable String id) { 
    	KieServerClient ksc = KieServerClient.getInstance();
    	boolean f = ksc.disposeAndRecreateContainer(id);
    	String res;
    	if (f) {
    		res = "true";
    	}
    	else {
    		res = "false";
    	}
    	return res;
    }
    
    
    @GetMapping("/containers/{id}")
    public String get_container_id(@PathVariable String id) {
    	KieServerClient ksc = KieServerClient.getInstance();
    	String info = ksc.getContainerById(id);
        return info;
    }
    

    // Item como prueba
    @PostMapping("containers/{id}/fact")
    public String rules(@PathVariable String id, @RequestBody Item item) {
        //int fired = this.rulesService.fireRules(item);

        System.out.println(item.toString());
       // System.out.println("Number of rules fired" + fired);
        return item.toString();
    }
}