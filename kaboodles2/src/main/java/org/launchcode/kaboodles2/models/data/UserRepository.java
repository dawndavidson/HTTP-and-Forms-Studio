package org.launchcode.kaboodles2.models.data;

import org.launchcode.kaboodles2.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}