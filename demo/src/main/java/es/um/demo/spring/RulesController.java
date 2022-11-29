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

import es.um.demo.drools_cli.Item;
import es.um.demo.drools_cli.KieServerClient;
import es.um.demo.drools_cli.Mensaje;

@RestController
public class RulesController {

    @Autowired
    RulesService rulesService;
    
   
    
    
    @GetMapping("/")
    public String index(Model modelo) {

    	List<Mensaje> mensajes = new LinkedList<>();
    	mensajes.add(new Mensaje("hola", 1));
    	mensajes.add(new Mensaje("adios", 2));
    	mensajes.add(new Mensaje("paso", 3));
    	modelo.addAttribute("mensajes", mensajes);
       	return "index";

    }
    
    @GetMapping("/containers")
    public String get_containers() { 
    	KieServerClient ksc = KieServerClient.getInstance();
    	String info = ksc.listContainers();
        return info;
    }
    
    @GetMapping("/containers/{id}")
    public String get_container_id(@PathVariable String id) {
    	// mirar templates para devolver hrefs
        return "Contenedor concreto!";
    }
    
    @GetMapping("/perro/{nombre}")
	public Map<String, String> perro(@PathVariable String nombre) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("nombre", nombre);
		map.put("que eres", "perro");
		return map;
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