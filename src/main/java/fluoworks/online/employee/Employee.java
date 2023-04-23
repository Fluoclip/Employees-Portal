package fluoworks.online.employee;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "employee")

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


    private Integer telefon;

    private String email;

    private Integer bewacherId;

    private String lvlOfEducation;


    public Employee(Integer id, String firstName, String lastName,
                    String street, String city, Integer telefon,
                    String email, Integer bewacherId, String lvlOfEducation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telefon = telefon;
        this.email = email;
        this.bewacherId = bewacherId;
        this.lvlOfEducation = lvlOfEducation;
    }

    public Employee(String firstName, String lastName,
                    String street, String city, Integer telefon,
                    String email, Integer bewacherId, String lvlOfEducation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.telefon = telefon;
        this.email = email;
        this.bewacherId = bewacherId;
        this.lvlOfEducation = lvlOfEducation;
    }

    public Employee() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBewacherId() {
        return bewacherId;
    }

    public void setBewacherId(Integer bewacherId) {
        this.bewacherId = bewacherId;
    }

    public String getLvlOfEducation() {
        return lvlOfEducation;
    }

    public void setLvlOfEducation(String lvlOfEducation) {
        this.lvlOfEducation = lvlOfEducation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telefon=" + telefon +
                ", email='" + email + '\'' +
                ", bewacherId=" + bewacherId +
                ", lvlOfEducation='" + lvlOfEducation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(telefon, employee.telefon) && Objects.equals(email, employee.email) && Objects.equals(bewacherId, employee.bewacherId) && Objects.equals(lvlOfEducation, employee.lvlOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName,  telefon, email, bewacherId, lvlOfEducation);
    }


}
