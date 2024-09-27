package art.com.backend_service.Repository;

import art.com.backend_service.Entity.DepartmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentInfo, UUID> {
}
