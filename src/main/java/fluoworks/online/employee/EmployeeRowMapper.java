package fluoworks.online.employee;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
                rs.getInt("id"),
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getString("Street"),
                rs.getString("City"),
                rs.getInt("telefon"),
                rs.getString("email"),
                rs.getInt("bewacherId"),
                rs.getString("lvlOfEducation"));

    }
}
