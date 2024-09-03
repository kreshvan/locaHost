
package me.Dmitriev.DZ.SPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/employee")
class EmployeesController {
    private final EmployeesService employeeService;

    @Autowired// автоматическое подключение
    public EmployeesController(EmployeesService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firsName,
                        @RequestParam String lastName,
                        @RequestParam String passport) {
        return employeeService.add(firsName, lastName , passport);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firsName,
                           @RequestParam String lastName,
                           @RequestParam String passport) {
        return employeeService.remove(firsName, lastName, passport);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firsName,
                         @RequestParam String lastName,
                         @RequestParam String passport) {
        return employeeService.find(firsName, lastName,passport);
    }

    @GetMapping("/fullEmployees")
    public Collection<Employee> fullEmployees() {
        return employeeService.fullEmployees;
    }
    @GetMapping("/passport")
    public String getPassport(@RequestParam("passport") String passport) {
return employeeService.getPassport(passport);

    }
}



















