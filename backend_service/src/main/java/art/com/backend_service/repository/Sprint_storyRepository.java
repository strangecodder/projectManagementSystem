package art.com.backend_service.repository;

import art.com.backend_service.entity.Activity;
import art.com.backend_service.entity.Sprint_story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Sprint_storyRepository extends JpaRepository<Sprint_story,Long> {
}
