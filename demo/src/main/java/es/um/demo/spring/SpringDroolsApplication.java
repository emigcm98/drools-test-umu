package es.um.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("es.um")
//@EntityScan("es.um.demo")
public class SpringDroolsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDroolsApplication.class, args);
	}
}