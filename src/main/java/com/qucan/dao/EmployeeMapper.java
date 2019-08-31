package com.qucan.dao;

import com.qucan.bean.Department;
import com.qucan.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface EmployeeMapper {




    @Select("select * from tbl_emp where emp_id=#{id}")
    Employee getEmpById(Integer id);




}
