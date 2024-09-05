
package me.Dmitriev.DZ.SPRING;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@Component
@ComponentScan
public  class EmployeeService  {

    Map<String,Employee> employeesMap = new HashMap<>(Map.of());


    public Collection<Employee>findAll(){
return Collections.unmodifiableCollection( employeesMap.values());
    }
}














