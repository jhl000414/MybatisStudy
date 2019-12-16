package com.hai.dao;

import com.hai.pojo.Student;
import com.hai.pojo.Teacher;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void testselect(){
        SqlSession session = MybatisUtils.getSqlSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        session.close();

    }

    @Test
    public void teststudent(){
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent();
        for (Student student : students) {
            System.out.println(student);

        }

        session.close();
    }

    @Test
    public void teststudent2(){
        SqlSession session = MybatisUtils.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudent2();
        for (Student student : students) {
            System.out.println(student);

        }

        session.close();
    }

}
