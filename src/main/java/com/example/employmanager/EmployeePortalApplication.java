package com.example.employmanager;

import com.example.employmanager.configuration.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@SpringBootApplication
@RestController
@RequestMapping("api/getEmployees")
public class EmployeePortalApplication {
	Employee employee = new Employee(1,"Josip",
			"Andric","Welfenstr. 10", "Augsburg",
			123450,231414,"Sachkunde Prufung");

    public static void main(String[] args) {
        SpringApplication.run(EmployeePortalApplication.class, args);

        System.out.println("Banana test!");
    }

    @GetMapping
    public Employee getEmployee() {


		return employee;

    }

}
