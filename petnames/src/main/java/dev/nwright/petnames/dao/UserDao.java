package dev.nwright.petnames.dao;

// import dev.nwright.petnames.data.UserRepository;
// import dev.nwright.petnames.models.User;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import
// org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Repository;
//
// import java.util.Optional;
//
// @Repository
// public class UserDao {
//
// @Autowired
// private UserRepository userRepository;
//
// public UserDetails findUserByEmail(String email) throws
// UsernameNotFoundException {
// Optional<User> optionalUser = userRepository.findByEmail(email);
//
// if (optionalUser.isPresent()) {
// return optionalUser.get();
// } else {
// throw new UsernameNotFoundException("No user found with that username.");
// }
// }
//
// }
