package art.com.backend_service.repository;

import art.com.backend_service.entity.Activity;
import art.com.backend_service.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
