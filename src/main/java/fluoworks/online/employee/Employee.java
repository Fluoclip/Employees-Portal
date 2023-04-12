package fluoworks.online.employee;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor

@Entity
public class Employee {
    public Employee(Integer id, String firstName, String lastName, String street, String city, Integer telefon, String email, Integer bewacherId, String lvlOfEducation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Street = street;
        City = city;
        this.telefon = telefon;
        this.email = email;
        this.bewacherId = bewacherId;
        this.lvlOfEducation = lvlOfEducation;
    }

    @Id
    @SequenceGenerator(
            name = "employee_id_sequence",
            sequenceName = "employee_id_sequence"

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_id_sequence"
    )

    private Integer id;
    private String firstName;
    private String lastName;
    private String Street;
    private String City;
    private Integer telefon;
    private String email;
    private Integer bewacherId;
    private String lvlOfEducation;


    public void addEmployee(EmployeeRequest request) {

        EmployeeDTO employeeDAO = new EmployeeDTO();

        setCity(request.city());
        setStreet(request.street());
        setBewacherId(request.bewacherId());
        setEmail(request.email());
        setFirstName(request.firstName());
        setLastName(request.lastName());
        setLvlOfEducation(request.lvlOfEducation());
        setTelefon(request.telefon());

        employeeRepository.save(employeeDAO);

    }


}
