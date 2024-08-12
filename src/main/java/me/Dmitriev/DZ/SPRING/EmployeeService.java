
package me.Dmitriev.DZ.SPRING;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@Service
@Component
public class EmployeeService implements EmployeesService {
    static final int MaxEmployees = 1000;
    List<Employee> employeesList = new ArrayList<>();

    @Override
    public Employee add(String firsName, String lastName) {
        Employee employee = new Employee(lastName, firsName);
        if (employeesList.size() > MaxEmployees) {
            throw new EmployeeStorageIsFullException("Превышен лимит сотрудников!");
        }
        if (employeesList.contains(employee)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже существует!");
        }
        employeesList.add(employee);
        return employee;

    }

    @Override
    public Employee remove(String firsName, String lastName) {
        Employee employee = new Employee(lastName, firsName);
        if (employeesList.contains(employee)) {
            employeesList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("EmployeeNotFoundException");
    }

    @Override
    public Employee find(String firsName, String lastName) {
        Employee employee = new Employee(firsName, lastName);
        if (employeesList.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("EmployeeNotFoundException");
    }

    public Collection<Employee> fullEmployees() {
        return Collections.unmodifiableList(employeesList);
    }

}













