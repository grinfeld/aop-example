package com.mikerusoft.aosp.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopExampleApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(AopExampleApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println(employeeService.getEmployee().getName());
		employeeService.getEmployee().setName("Him");
        employeeService.setEmployee(new Employee("Hello"));
        try {
            employeeService.getEmployee().throwException();
        } catch (Exception e) {
		    //e.printStackTrace();
        }
	}

	@Bean
	public Employee getEmployee() {
	    return new Employee("Me");
    }
}
