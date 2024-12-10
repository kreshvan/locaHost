
package me.Dmitriev.DZ.SPRING;

import java.util.Collection;
import java.util.List;

public interface EmployeesService {
    Employee add(String firstName, String lastName, String passport);

    Employee remove(String firstName, String lastName, String passport);

    Employee add(String firstName, String lastName, String passport, int salary, int department);

    Employee add(String firsName, String lastName, String passport, String salary, String department);

    Employee remove(String firsName, String lastName, String passport, int salary, int department);

    Employee find(String firstName, String lastName, String passport);

    List<Employee> fullEmployees = null;

    String getPassport(String passport);



    Employee find(String firsName, String lastName, String passport, int salary, int department);

    Collection<Employee> findAll();

}

