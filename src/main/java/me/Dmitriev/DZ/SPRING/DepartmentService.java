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

    public Employee maxSalary(int department) {
        return employeeService.findAll().stream()
                .filter(emp -> emp.getDepartment() == department)
                .max(Comparator.comparingDouble(emp -> emp.getSalary()))
                .orElseThrow();
    }

    public Employee minSalary(int department) {
        return employeeService.findAll().stream()
                .filter(emp -> emp.getDepartment() == department)   //берем сотрудника.
                // вызываем его отдел.
                // отдел должен быть равен одному из отделов в списке - листе
                .min(Comparator.comparingDouble(emp -> emp.getSalary()))
                .orElseThrow();
    }

    public List<Employee> allEmployeeDepartment(int department) {
        return employeeService.findAll().stream()
                .filter(emp -> emp.department == department)
                .collect(Collectors.toList());
    }

    public Map<Integer, List<Employee>> allDepartments() {
        return employeeService.findAll().stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment()));
    }


}







