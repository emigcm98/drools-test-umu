package es.um.demo.spring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
  @RequestMapping("/index")
  @ResponseBody
  public String index(Model modelo) {
    
    
    modelo.addAttribute("mensaje","hola desde thymeleaf");
    return "index";
  }
}