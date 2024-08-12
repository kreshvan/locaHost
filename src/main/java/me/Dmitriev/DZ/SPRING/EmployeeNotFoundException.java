


package me.Dmitriev.DZ.SPRING;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("EmployeeNotFoundException");
    }

    public EmployeeNotFoundException(String sms) {
        super(sms);

    }

}