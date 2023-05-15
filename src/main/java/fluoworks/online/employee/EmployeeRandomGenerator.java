package fluoworks.online.employee;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRandomGenerator {

    private final EmployeeRepository employeeRepository;

    public EmployeeRandomGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @PostConstruct
    public void addSpecificNumOfEmployees(int numOfEmp){

        for( int i =0; i < numOfEmp; i++){

            Employee employee = new Employee();

            employee.setFirstName("ime" + i);
            employee.setLastName("prezime" + i);
            employee.setTelefon(3213214);
            employee.setEmail("ime"+ "prezime" + i + "@gmail.com");
            employee.setBewacherId(21313);
            employee.setLvlOfEducation("Sachkunde");

            employeeRepository.save(employee);

        }
    }
}
