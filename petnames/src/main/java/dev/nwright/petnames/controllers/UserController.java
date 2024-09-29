package dev.nwright.petnames.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.nwright.petnames.models.User;
import dev.nwright.petnames.repositories.UserRepository;

@Controller
@RequestMapping(path = "/user")
public class UserController {

  private UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @PostMapping(path = "/add")
  public @ResponseBody String addNewUser(
      @RequestParam String name,
      @RequestParam String email) {

    User u = new User();
    u.setUsername(name);
    u.setEmail(email);

    userRepository.save(u);
    return "Success";
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
}
