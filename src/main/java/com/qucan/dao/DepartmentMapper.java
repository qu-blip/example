package com.qucan.dao;

import com.qucan.bean.Department;
import com.qucan.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface DepartmentMapper {
    @Select("select * from Department where is=#{id}")
    Department getDeptById(Integer id);
}
