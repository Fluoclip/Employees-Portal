package fluoworks.online.employee;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("jdbc")
public class EmployeeJDBCDataAccesService implements EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;
    private final EmployeeRowMapper employeeRowMapper;

    public EmployeeJDBCDataAccesService(JdbcTemplate jdbcTemplate, EmployeeRowMapper employeeRowMapper) {

        this.jdbcTemplate = jdbcTemplate;
        this.employeeRowMapper = employeeRowMapper;
    }

    @Override
    public List<Employee> selectAllEmployees() {
        var sql = """
                SELECT id, firstName, lastName, Street, City, telefon, bewacherId, lvlOfEducation
                FROM employee
                LIMIT 10
                """;

        return jdbcTemplate.query(sql, employeeRowMapper);
    }


    @Override
    public void insertEmployee(Employee employee) {
        var sql = """
                INSERT INTO employee(firstName, lastName, Street, City, telefon, email, bewacherId, lvlOfEducation)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                """;
        int result = jdbcTemplate.update(
                sql,

                employee.getFirstName(),
                employee.getLastName(),
                employee.getStreet(),
                employee.getCity(),
                employee.getTelefon(),
                employee.getEmail(),
                employee.getBewacherId(),
                employee.getLvlOfEducation()
        );

        System.out.println("insertEmployee result " + result);

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
