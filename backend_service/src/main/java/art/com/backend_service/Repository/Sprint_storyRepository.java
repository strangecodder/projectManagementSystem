package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Sprint_story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sprint_storyRepository extends JpaRepository<Sprint_story,Long> {
}
