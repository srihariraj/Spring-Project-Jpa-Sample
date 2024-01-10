package com.Project.DataJPA;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Project.DataJPA.modelClasses.Students;
import com.Project.DataJPA.serviceImplementations.LogicImplementation;

@SpringBootApplication
public class UserAccountsApplication {

	private static LogicImplementation logic;
	public UserAccountsApplication(LogicImplementation Logic) {
		logic=Logic;
	}
	public static void main(String[] args) {
		SpringApplication.run(UserAccountsApplication.class, args);
		
		Students S1 = new Students(111, "Sri", "CSE",78.45F);
		
		logic.save(S1);
	}

}
