package com.qucan.test;

import com.qucan.bean.Person;
import com.qucan.dao.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    @Cacheable
            public  void hh(){
        System.out.println(employeeMapper);
        System.out.println(employeeMapper.getEmpById(3));

    }

}
