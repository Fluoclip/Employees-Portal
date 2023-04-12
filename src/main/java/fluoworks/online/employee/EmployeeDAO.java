package fluoworks.online.employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> selectAllCustomers();

    void insertEmployee(Employee employee);

    boolean existsEmployeeWithEmail(String email);

    boolean existsEmployeeById(Integer emplpyeeId);

    void deleteEmployeeById(Integer employeeId);

    void updateEmployee(Employee update);
}
