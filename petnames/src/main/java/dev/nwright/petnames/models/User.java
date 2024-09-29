package dev.nwright.petnames.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

//import jakarta.servlet.http.HttpServletRequest;

@Entity
@Table(name = "USERS")
@CrossOrigin(origins = "http://localhost:4200") // , allowCredentials = "true")
public class User extends AbstractEntity {
  private String username;
  private String password;

  public User(String username, String password) {
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

  public void setPassword(String password) {
    this.password = password;
  }
}
