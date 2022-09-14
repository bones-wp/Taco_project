package spring.taco.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.taco.security.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
