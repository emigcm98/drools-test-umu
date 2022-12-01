package es.um.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.um.demo.drools_cli.KieServerClient;

@RestController
@RequestMapping(value = "/")
public class RootController {

	@Autowired
	RulesService rulesService;

	@GetMapping("error")
	public String error() {
		return "error xd";
	}

}
