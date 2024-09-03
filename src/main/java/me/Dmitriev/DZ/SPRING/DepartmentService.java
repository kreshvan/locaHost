package me.Dmitriev.DZ.SPRING;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Component
public class DepartmentService {
    private final EmployeeService employeeService;

    public DepartmentService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee maxSalary(int departmentId) {

        return employeeService.findAll().stream()
                .filter(emp->emp.getDepartment()==departmentId)
                .max(Comparator.comparingDouble(x -> x.getSalary()))
                .orElseThrow();
    }

    public Employee minSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(emp->emp.getDepartment()==departmentId)
                .min(Comparator.comparingDouble(x -> x.getSalary()))
                .orElseThrow();
    }

    public List<Employee> allDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartment()==departmentId)
                .collect(Collectors.toList());
    }

    public Map<Integer,List<Employee>> allDepartments() {
        return employeeService.findAll().stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()));
    }
}