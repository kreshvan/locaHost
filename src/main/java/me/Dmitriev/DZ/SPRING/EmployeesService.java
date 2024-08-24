
package me.Dmitriev.DZ.SPRING;

import java.util.Collection;
import java.util.List;

public interface EmployeesService {
    Employee add(String firstName, String lastName, String passport);

    Employee remove(String firstName, String lastName, String passport);

    Employee find(String firstName, String lastName, String passport);

    List<Employee> fullEmployees = null;

    String getPassport(String passport);

    Collection<Employee> findAll();
}

