package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }

    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
