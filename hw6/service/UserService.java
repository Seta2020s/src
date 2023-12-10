package service;

import java.util.List;
import model.User;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String lastName);

    List<T> getUserList();
}