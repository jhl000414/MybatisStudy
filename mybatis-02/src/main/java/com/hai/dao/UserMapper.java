package com.hai.dao;



import com.hai.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();



    User getUserById(int id);



    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);


}
