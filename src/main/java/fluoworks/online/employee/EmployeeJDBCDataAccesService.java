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
                LIMIT 1000
                """;

        return jdbcTemplate.query(sql, employeeRowMapper);
    }


    @Override
    public void insertEmployee(Employee employee) {

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
