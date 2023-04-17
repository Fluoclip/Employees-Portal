package fluoworks.online.employee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {


        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();

    }

    public void addEmployee(EmployeeRegistrationRequest request) {

        Employee employee = new Employee();

                employee.setFirstName(request.firstName());
                employee.setLastName(request.lastName());
                employee.setStreet(request.Street());
                employee.setCity(request.City());
                employee.setTelefon(request.telefon());
                employee.setEmail(request.email());
                employee.setBewacherId(request.bewacherId());
                employee.setLvlOfEducation(request.lvlOfEducation());

                employeeRepository.save(employee);
    }

}

