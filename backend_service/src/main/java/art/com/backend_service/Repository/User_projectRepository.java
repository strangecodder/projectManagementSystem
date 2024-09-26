package art.com.backend_service.Repository;

import art.com.backend_service.Entity.User_Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_projectRepository extends JpaRepository<User_Project,Long> {
}
