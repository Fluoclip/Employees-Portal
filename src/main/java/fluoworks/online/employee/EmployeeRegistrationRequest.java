package fluoworks.online.employee;

public record EmployeeRegistrationRequest(
        String firstName,
        String lastName,
        Integer telefon,
        String email,
        Integer bewacherId,
        String lvlOfEducation
) {
}

