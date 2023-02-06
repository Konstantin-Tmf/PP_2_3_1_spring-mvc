package web.dao;


import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> showAll();

    void createUser(User user);

    User showUser(int id);

    void deleteUser(int id);

    void updateUser(User user);

}
