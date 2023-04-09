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
    public List<Employee> getEmployee() {

        return employeeRepository.findAll();
    }



    @CrossOrigin
    @PostMapping
    public void addEmployee(@RequestBody EmployeeRequest request) {
        Employee employee = new Employee();

        employee.setCity(request.city());
        employee.setStreet(request.street());
        employee.setBewacherId(request.bewacherId());
        employee.setEmail(request.email());
        employee.setFirstName(request.firstName());
        employee.setLastName(request.lastName());
        employee.setLvlOfEducation(request.lvlOfEducation());
        employee.setTelefon(request.telefon());

        employeeRepository.save(employee);


    }


}
