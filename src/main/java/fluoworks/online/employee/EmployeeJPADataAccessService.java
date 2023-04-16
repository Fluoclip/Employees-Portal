package fluoworks.online.employee;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jpa")
public class EmployeeJPADataAccessService implements EmployeeDAO {

    private final EmployeeRepository employeeRepository;

    public EmployeeJPADataAccessService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        Page<Employee> page = employeeRepository.findAll(Pageable.ofSize(10));
        return page.getContent();
    }

    @Override
    public void insertEmployee(Employee employee) {

        employeeRepository.save(employee);

    }

    @Override
    public boolean existsEmployeeWithEmail(String email) {
        return false;
    }

    @Override
    public boolean existsEmployeeById(Integer emplpyeeId) {
        return false;
    }

    @Override
    public void deleteEmployeeById(Integer employeeId) {

    }

    @Override
    public void updateEmployee(Employee update) {

    }
}
