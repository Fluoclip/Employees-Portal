package fluoworks.online.employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//ALL REQESTS
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping
    public List<EmployeeDTO> getEmployees() {

        return EmployeeService.getAllEmployees();
    }

    // Ovdje treba returnat employee.addEmployee(request), a u Employee moram dodat tu metodu koja prima request kao argument a tamo ide u EmployeeDAO

//    @CrossOrigin
//    @PostMapping
//    public addEmployee(@RequestBody EmployeeRequest request) {
//
//        return employee.addEmployee(request);
//
//
//    }


}
