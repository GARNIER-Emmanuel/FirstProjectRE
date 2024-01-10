package service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class UserService implements IUserService {

    private List<User> userList = new ArrayList<>();

    public void createUser(User user) {
        user.add(userList);
    }
}