
package me.Dmitriev.DZ.SPRING;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Component
@ComponentScan
public  class EmployeeService implements EmployeesService {

    Map<String,Employee> employeesMap = new HashMap<>(Map.of());



    @Override
    public Employee add(String firstName, String lastName, String passport) {
        return null;
    }

    @Override
    public Employee remove(String firstName, String lastName, String passport) {

        return null;
    }

    @Override
    public Employee add(String firsName, String lastName, String passport,int salary,int department) {
        Employee employee = new Employee(lastName, firsName, passport,salary,department);

        if (employeesMap.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже существует!");
        }
        employeesMap.put(employee.getFullName(),employee);
        return employee;

    }

    @Override
    public Employee add(String firsName, String lastName, String passport, String salary, String department) {
        return null;
    }

    @Override
    public Employee remove(String firsName, String lastName, String passport, int salary, int department) {
        Employee employee = new Employee(lastName, firsName, passport,salary,department);
        if (employeesMap.containsKey(employee.getFullName())) {
            employeesMap.remove(employee.getFullName());
            return employee;
        }
        throw new EmployeeNotFoundException("EmployeeNotFoundException");
    }

    @Override
    public Employee find(String firstName, String lastName, String passport) {

        return null;
    }

    @Override
    public String getPassport(String passport) {

        return "";
    }

    @Override
    public Employee find(String firsName, String lastName, String passport, int salary, int department) {
        Employee employee = new Employee(firsName, lastName, passport, salary, department);
        if (employeesMap.containsKey(employee.getFullName())) {
            return employeesMap.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("EmployeeNotFoundException");
    }



    @Override
    public Collection<Employee>findAll(){
return Collections.unmodifiableCollection( employeesMap.values());
    }
}














