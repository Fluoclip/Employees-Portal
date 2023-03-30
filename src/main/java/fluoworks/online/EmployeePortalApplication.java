package fluoworks.online;

import fluoworks.online.employee.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api/getEmployees")
public class EmployeePortalApplication {
    Employee employee = new Employee(1, "Josip",
            "Andric", "Welfenstr. 10", "Augsburg",
            123450, "josip@gmail.com", 231414, "Sachkunde Prufung");

    public static void main(String[] args) {
        SpringApplication.run(EmployeePortalApplication.class, args);

        System.out.println("Banana test!");
    }

    @GetMapping
    public Employee getEmployee() {

        return employee;
    }

}
