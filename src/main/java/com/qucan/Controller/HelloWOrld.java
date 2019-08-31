package com.qucan.Controller;

import com.qucan.bean.Employee;
import com.qucan.bean.Person;
import com.qucan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWOrld {
    @Autowired
    EmployeeService employeeService;


    @GetMapping(value = "/emp")
    public Employee getEmp (Integer id){

        return employeeService.getEmp(id);
    }



}
