package dev.nwright.petnames.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

//import jakarta.servlet.http.HttpServletRequest;

@Entity
@Table(name = "USERS")
public class User extends AbstractEntity {
  private String username;
  private String email;
  private String password;

  public User() {
  }

  public User(String username, String email, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String email) {
    this.password = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
