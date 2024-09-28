package art.com.backend_service.Repository;

import art.com.backend_service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u.id_user from User u where u.username =: username")
    int getIdByUsername(@Param(value = "username") String username);
}
