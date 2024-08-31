
package me.Dmitriev.DZ.SPRING;

public class EmployeeStorageIsFullException extends RuntimeException {
    public EmployeeStorageIsFullException(String sms) {
        super(sms);
    }

}




