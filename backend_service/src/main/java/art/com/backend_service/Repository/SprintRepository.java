package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends JpaRepository<Sprint,Long> {
}
