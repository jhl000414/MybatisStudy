package com.hai.dao;

import com.hai.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeacher1();

    public Teacher getTeacher(int id);
    public Teacher getTeacher2(int id);
}
