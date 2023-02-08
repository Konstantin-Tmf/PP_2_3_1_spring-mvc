package web.dao;


import web.entity.User;

import java.util.List;

public interface UserDao {
    List<User> showAll();

    void createUser(User user);

    User showUser(Long id);

    void deleteUser(Long id);

    void updateUser(User user);

}
