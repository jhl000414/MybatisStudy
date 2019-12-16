package com.hai.dao;

import com.hai.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /*查询*/
    @Select("select * from user")
    List<User> getUsers();


    /*添加用户*/
    @Insert("insert into user (id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    /*更新用户*/
    @Update("update user set name=#{name},#{password} where id = #{id}")
    int updateUser(User user);

    /*删除用户*/
    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);

}
