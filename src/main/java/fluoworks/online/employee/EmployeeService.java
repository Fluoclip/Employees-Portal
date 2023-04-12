package fluoworks.online.employee;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDAO employeeDAO;

    public EmployeeService(@Qualifier("jdbc") EmployeeDAO employeeDAO) {
        
        this.employeeDAO = employeeDAO;
    }

    public static List<EmployeeDTO> getAll() {

    }
}
