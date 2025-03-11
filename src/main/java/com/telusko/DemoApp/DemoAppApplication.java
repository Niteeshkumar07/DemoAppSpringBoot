package com.telusko.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(DemoAppApplication.class, args);
		//Dev obj = new Dev(); as Spring create the object when we used to it

		Dev obj = context.getBean(Dev.class);
		obj.build();
		//build(); as it do not run as we know that in java we create first object then we run it
	}

}
