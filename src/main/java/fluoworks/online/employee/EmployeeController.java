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
//    Employee employee = new Employee(1, "Josip",
//            "Andric", "Welfenstr. 10", "Augsburg",
//            123450, "josip@gmail.com", 231414, "Sachkunde Prufung");


    @GetMapping
    public List<Employee> getEmployee() {

        return employeeRepository.findAll();
    }

    record NewEmployeeRequest(

            String firstName,
            String lastName,
            String street,
            String city,
            Integer telefon,
            String email,
            Integer bewacherId,
            String lvlOfEducation

    ) {

    }

    @CrossOrigin
    @PostMapping
    public void addEmployee(@RequestBody NewEmployeeRequest request) {
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
