package fluoworks.online.employee;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ALL REQESTS
@RestController
@RequestMapping("api/employees")
public class EmployeeController {


    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }


    @GetMapping
    public List<EmployeeDTO> getEmployees() {

        return employeeService.getAllEmployees();
    }

       @CrossOrigin
       @PostMapping
       public ResponseEntity<?> registerCustomer(
               @RequestBody EmployeeRegistrationRequest request) {
           employeeService.addEmployee(request);

           return ResponseEntity.ok()
                   .header(HttpHeaders.AUTHORIZATION)
                   .build();
       }


}
