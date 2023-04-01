package fluoworks.online.employee;

import jakarta.persistence.*;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Street='" + Street + '\'' +
                ", City='" + City + '\'' +
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
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(Street, employee.Street) && Objects.equals(City, employee.City) && Objects.equals(telefon, employee.telefon) && Objects.equals(email, employee.email) && Objects.equals(bewacherId, employee.bewacherId) && Objects.equals(lvlOfEducation, employee.lvlOfEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, Street, City, telefon, email, bewacherId, lvlOfEducation);
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

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefonNum) {
        this.telefon = telefonNum;
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

    public Employee(Integer id, String firstName, String lastName, String street, String city, Integer telefonNum, String email, Integer bewacherId, String lvlOfEducation) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Street = street;
        City = city;
        this.telefon = telefonNum;
        this.email = email;
        this.bewacherId = bewacherId;
        this.lvlOfEducation = lvlOfEducation;
    }

    public Employee() {
    }
}
