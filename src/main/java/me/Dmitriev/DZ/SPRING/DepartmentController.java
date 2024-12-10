package me.Dmitriev.DZ.SPRING;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee maxSalary(@RequestParam("department") int department) {
        return departmentService.maxSalary(department);
    }

    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam("department") int department) {
        return departmentService.minSalary(department);
    }

    @GetMapping("/all/department")
    public List<Employee> allDepartment(@RequestParam("department") int department) {
        return departmentService.allEmployeeDepartment(department);
    }


}
