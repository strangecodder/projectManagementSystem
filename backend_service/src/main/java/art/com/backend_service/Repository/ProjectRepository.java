package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Project;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    @Modifying
    @Transactional
    @Query("update Project p set p.description =:description  where p.id_project = :id")
void updateProjectByDescription(@Param("description") String description,@Param("id")Long id);
    @Modifying
    @Transactional
    @Query("update Project p set p.name =:name  where p.id_project = :id")
    void updateProjectByName(@Param("name") String name,@Param("id")Long id);
}
