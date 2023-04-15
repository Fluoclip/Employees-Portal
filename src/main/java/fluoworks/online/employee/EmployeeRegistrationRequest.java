package fluoworks.online.employee;

public record EmployeeRegistrationRequest(
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

