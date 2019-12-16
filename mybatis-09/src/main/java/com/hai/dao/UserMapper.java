package com.hai.dao;

import com.hai.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUserById(@Param("id") int id);
}
