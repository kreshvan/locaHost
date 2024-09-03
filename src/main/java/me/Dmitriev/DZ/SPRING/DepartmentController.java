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
    public Employee maxSalary(@RequestParam("departmentId") int departmentId){
return departmentService.maxSalary(departmentId);
    }
    @GetMapping("/min-salary")
    public Employee minSalary(@RequestParam("departmentId") int departmentId){
return departmentService.minSalary(departmentId);
    }
    @GetMapping("/all/Department")
    public List<Employee> allDepartment(@RequestParam("departmentId") int departmentId){
return departmentService.allDepartment(departmentId);
    }
    @GetMapping("/all/Departments")
    public Map<Integer,List<Employee>> allDepartments(){
return departmentService.allDepartments();
    }







}
