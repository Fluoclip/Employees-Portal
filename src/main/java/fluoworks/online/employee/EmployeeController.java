package fluoworks.online.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//ALL REQUESTS
@RestController
@RequestMapping("api/employees")
public class EmployeeController {


    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;


    }


    @GetMapping
    public List<Employee> getEmployees() {

        return employeeService.getAllEmployees();
    }

    // @CrossOrigin
    @PostMapping
    public void registerCustomer(@RequestBody EmployeeRegistrationRequest request) {

        employeeService.addEmployee(request);

    }


}
