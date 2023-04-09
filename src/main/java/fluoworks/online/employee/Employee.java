package fluoworks.online.employee;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class Employee {
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



}
