package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import models.bookstore.User;

public class UserService
{
  List<User> users = new ArrayList<>();

  public boolean authenticate(String userName, String password) {
    return users.stream()
        .filter(user -> user.getUsername().equalsIgnoreCase(userName) && user.getPassword().equals(password))
        .findFirst().isPresent();
  }

  public void registerUser(User user) {
    if (users.stream().filter(user1 -> user1.getUsername().equalsIgnoreCase(user.getUsername())).findFirst().isPresent()) {
      throw new RuntimeException("The user is already a registered user");
    }
    users.add(user);
  }

  public List<User> listUsers() {
    if (users==null || users.isEmpty()) {
      throw new RuntimeException("No users found");
    }
    return users;
  }


  public void registerUser(String userName, String password, String email) {
    User user = new User(userName, password, email);
    registerUser(user);
  }
}
