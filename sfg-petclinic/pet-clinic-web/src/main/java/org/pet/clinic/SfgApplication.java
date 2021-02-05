package org.pet.clinic;

import java.util.Arrays;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SfgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgApplication.class, args);
//		ConfigurableApplicationContext ctx = SpringApplication.run(SfgApplication.class, args);
//		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(n->System.out.println(n));
	}

}
