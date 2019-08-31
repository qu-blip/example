package com.qucan.service;

import com.qucan.bean.Employee;
import com.qucan.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;



    @Cacheable(cacheNames = "emp")
    public Employee getEmp(Integer id){
        System.out.println("执行一个查询操作");
        return employeeMapper.getEmpById(id);
    }

}
