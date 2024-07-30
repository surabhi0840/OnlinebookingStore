package models.bookstore;

import models.bookstore.enums.UserStatus;
import models.bookstore.enums.UserType;

public class User {

  private String username;
  private String password;
  private int id;
  private String userName;
  private String email;
  private UserStatus status;
  private UserType userType;
  private static int count=0;

  public User(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.status = UserStatus.ACTIVE;
    count++;
    id = count;
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public String getUsername() {
    return username;
  }
}
