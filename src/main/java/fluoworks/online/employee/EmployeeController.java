package fluoworks.online.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ALL REQESTS
@RestController
@RequestMapping("api/getEmployees")
public class EmployeeController {

    Employee employee = new Employee(1, "Josip",
            "Andric", "Welfenstr. 10", "Augsburg",
            123450, "josip@gmail.com", 231414, "Sachkunde Prufung");



    @GetMapping
    public Employee getEmployee() {

        return employee;
    }

}
