package com.hai.dao;



import com.hai.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    List<User> getUserLike(String name);

    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    int addUser2(Map<String, Object> map);
}
