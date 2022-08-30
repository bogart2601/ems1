package com.project.springbootbackend;

import com.project.springbootbackend.model.Employee;
import com.project.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Bogart");
		employee.setLastName("Silveira");
		employee.setEmailId("bogart2601@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Tim");
		employee1.setLastName("Roger");
		employee1.setEmailId("troger@gmail.com");
		employeeRepository.save(employee1);
	}

}
