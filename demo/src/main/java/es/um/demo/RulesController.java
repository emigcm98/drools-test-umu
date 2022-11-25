package es.um.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {

    @Autowired
    RulesService rulesService;

    @GetMapping("/")
    public String index() {
        return "cashate pelotudo!";
    }
    
    @GetMapping("/perro/{nombre}")
	public Map<String, String> perro(@PathVariable String nombre) {
		
		HashMap<String, String> map = new HashMap<>();
		map.put("nombre", nombre);
		map.put("que eres", "perro");
		return map;
	}

    
    @PostMapping("/rules")
    public String rules(@RequestBody Item item) {
        //int fired = this.rulesService.fireRules(item);

        System.out.println(item.toString());
        System.out.println("Number of rules fired" + fired);
        return "Greetings from Spring Boot!";
    }
}