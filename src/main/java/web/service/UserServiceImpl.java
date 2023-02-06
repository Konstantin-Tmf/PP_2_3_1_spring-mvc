package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.entity.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public List<User> showAll() {
        return userDao.showAll();
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public User showUser(int id) {
        return userDao.showUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
