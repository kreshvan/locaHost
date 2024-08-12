

package me.Dmitriev.DZ.SPRING;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String sms) {
        super(sms);
    }
}
