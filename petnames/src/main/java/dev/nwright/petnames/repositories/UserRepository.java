package dev.nwright.petnames.repositories;

import org.springframework.data.repository.CrudRepository;
import dev.nwright.petnames.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
