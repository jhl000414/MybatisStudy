package com.hai.dao;



import com.hai.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(int id);

    List<User> selectUser(Map<String,Integer> map);

    List<User> getUserByRowBounds();

}
