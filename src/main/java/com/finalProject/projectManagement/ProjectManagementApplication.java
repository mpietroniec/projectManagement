package com.finalProject.projectManagement;

import com.finalProject.projectManagement.configuration.SpringDBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProjectManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
		System.out.println("Hello World");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringDBConfig.class);

//		SpringService springService = context.getBean(SpringService.class);
//		UserService userService = context.getBean(UserService.class);
//
//		userService.saveUser();
	}

}
