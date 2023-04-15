package fluoworks.online.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeDAO employeeDAO;
    private final EmployeeDTOMapper employeeDTOMapper;

    public EmployeeService(@Qualifier("jdbc") EmployeeDAO employeeDAO, EmployeeDTOMapper employeeDTOMapper) {
        
        this.employeeDAO = employeeDAO;
        this.employeeDTOMapper = employeeDTOMapper;
    }

    public  List<EmployeeDTO> getAllEmployees() {
        return employeeDAO.selectAllEmployees()
                .stream()
                .map(employeeDTOMapper)
                .collect(Collectors.toList());

    }

    public void addEmployee(EmployeeRegistrationRequest employeeRegistrationRequest) {

        Employee employee = new Employee(
                employeeRegistrationRequest.firstName(),
                employeeRegistrationRequest.lastName(),
                employeeRegistrationRequest.Street(),
                employeeRegistrationRequest.City(),
                employeeRegistrationRequest.telefon(),
                employeeRegistrationRequest.email(),
                employeeRegistrationRequest.bewacherId(),
                employeeRegistrationRequest.lvlOfEducation());



        employeeDAO.insertEmployee(employee);
    }

}

