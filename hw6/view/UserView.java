package view;

import java.util.List;

import model.User;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}