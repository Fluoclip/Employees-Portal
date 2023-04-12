package fluoworks.online.employee;

public record EmployeeDTO(
        Integer id,
        String firstName,
        String lastName,
        String Street,
        String City,
        Integer telefon,
        String email,
        Integer bewacherId,
        String lvlOfEducation
) {
}
