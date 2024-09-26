package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Status_activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Status_activityRepository extends JpaRepository<Status_activity,Long> {
}
