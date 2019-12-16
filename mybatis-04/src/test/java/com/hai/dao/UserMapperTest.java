package com.hai.dao;

import com.hai.pojo.User;
import com.hai.util.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserMapperTest {

    Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void testselectUser(){
        SqlSession session = MybatisUtils.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> users = mapper.selectUser(map);

        for (User user: users){
            System.out.println(user);
        }

        session.close();



    }

    @Test
    public void testUserByRowBounds() {
        SqlSession session = MybatisUtils.getSqlSession();

        int currentPage = 2;  //第几页
        int pageSize = 2;  //每页显示几个
        RowBounds rowBounds = new RowBounds((currentPage-1)*pageSize,pageSize);

        //通过session.**方法进行传递rowBounds，[此种方式现在已经不推荐使用了]
        List<User> users = session.selectList("com.hai.mapper.UserMapper.getUserByRowBounds", null, rowBounds);

        for (User user: users){
            System.out.println(user);
        }
        session.close();
    }


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
    }

    @Test
    public void logtest() {
        logger.info("info:enter log4j");
        logger.debug("debug: enter debug");
        logger.error("error: enter error");
    }

}
