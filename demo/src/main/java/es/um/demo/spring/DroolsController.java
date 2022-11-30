package es.um.demo.spring;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.demo.drools_cli.DroolsClient;
import es.um.demo.drools_cli.KieServerClient;
import es.um.demo.models.data.ContainerJSON;
import es.um.demo.models.data.Item;
import es.um.demo.models.data.Mensaje;
import es.um.demo.models.data.PruebaJSON;

@RestController
@RequestMapping(path="/drools", consumes = "application/json", produces="application/json")
public class DroolsController {

	@Autowired
    RulesService rulesService;
 
//    @GetMapping("/containers/{id}")
//    public String get_container_id(@PathVariable String id) {
//    	KieServerClient ksc = KieServerClient.getInstance();
//    	String info = ksc.getContainerById(id);
//        return info;
//    }
    
    
    @PostMapping("container/create")
    public String createContainer(@RequestBody ContainerJSON cj) {
        
    	DroolsClient dc = DroolsClient.getInstance();
    	boolean res = dc.createContainer(cj);
    	
    	if (res) return "true";
    	else return "false";
    }

}
