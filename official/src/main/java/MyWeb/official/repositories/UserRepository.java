package MyWeb.official.repositories;

import MyWeb.official.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// User Repository, manage the connection with dataBase

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
