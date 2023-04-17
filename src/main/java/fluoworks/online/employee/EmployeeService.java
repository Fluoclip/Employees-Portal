package fluoworks.online.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeDAO employeeDAO;
    private final EmployeeDTOMapper employeeDTOMapper;
    private final EmployeeRepository employeeRepository;

    public EmployeeService(@Qualifier("jdbc") EmployeeDAO employeeDAO, EmployeeDTOMapper employeeDTOMapper, EmployeeRepository employeeRepository) {
        
        this.employeeDAO = employeeDAO;
        this.employeeDTOMapper = employeeDTOMapper;
        this.employeeRepository = employeeRepository;
    }

    public  List<Employee> getAllEmployees() {
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

