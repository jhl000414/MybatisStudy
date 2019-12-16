package com.hai.dao;

import com.hai.pojo.User;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.UserException;

import java.util.List;

public class UserMapperTest {
    /*查询用户*/
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        session.close();
    }
    /*添加用户*/
    @Test
    public void testaddUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5, "hello", "334455"));
        sqlSession.close();
    }
    /*更新用户*/
    @Test
    public void testupdateUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User(5,"hello","3355");
        mapper.updateUser(user);

        session.close();


    }
    /*删除用户*/
    @Test
    public void testdeleteUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.deleteUser(5);
        session.close();
    }
}
