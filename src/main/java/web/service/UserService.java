package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {
    List<User> showAll();

    void createUser(User user);

    User showUser(int id);

    void deleteUser(int id);

    void updateUser(User user);
}
