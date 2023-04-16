package fluoworks.online.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDataAccessService implements EmployeeDAO{

    private static final List<Employee> employees;

    static {
        employees = new ArrayList<>();

        Employee goga = new Employee(
                "Gorana",
                "Andric",
                "Welfenstr. 10",
                "Augsburg",
                2341412,
                "goga@gmail.com",
                323342,
                "Sachkunde"


        );
        employees.add(goga);
    }

    @Override
    public List<Employee> selectAllEmployees() {
        return employees;
    }

    @Override
    public void insertEmployee(Employee employee) {
        employees.add(employee);
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

//    private Integer id;
//    private String firstName;
//    private String lastName;
//    private String Street;
//    private String City;
//    private Integer telefon;
//    private String email;
//    private Integer bewacherId;
//    private String lvlOfEducation;