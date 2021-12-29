package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserDao {
    public void addUser(User user);
    public void removeUserById(long id);
    public List<User> getAllUsers();
    public void updateUser(User user, long id);
    public User getUser(long id);
}
