package com.hai.dao;

import com.hai.pojo.User;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }



    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }


    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int haha = mapper.addUser(new User(4, "haha", "12344"));
        if (haha > 0) {
            sqlSession.commit();
        }
        sqlSession.close();
    }



    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4, "李五", "12233"));
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        //注意删除四号人后，你需要再插入一次四号user,就是调用上面那个方法。
        sqlSession.commit();
        sqlSession.close();
    }
}
