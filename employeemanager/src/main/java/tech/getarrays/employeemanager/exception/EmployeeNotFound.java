package tech.getarrays.employeemanager.exception;

public class EmployeeNotFound extends RuntimeException {
    public EmployeeNotFound(String message) {
        super(message);
    }
}
