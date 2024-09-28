package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Sprint;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, Long> {
    @Query("select  s.id_sprint,s.name,s.start_date,s.sprintStories,s.end_date,s.project_id   from Sprint s where s.project_id=:pid")// не работает ,почему? А я не ебу
    List<Sprint> findAllByProject_id(@Param("pid") Long pid);

    @Modifying
    @Transactional
    @Query("update Sprint s set s.end_date =:endDate  where s.id_sprint = :id")
    void updateByEnd_date(@Param("endDate") LocalDate endDate, @Param("id") Long id);

    @Modifying
    @Transactional
    @Query("update Sprint s set s.start_date =:startDate  where s.id_sprint = :id")
    void updateByStart_date(@Param("startDate") LocalDate startDate, @Param("id") Long id);

    @Modifying
    @Transactional
    @Query("update Sprint s set s.name =:name  where s.id_sprint = :id")
    void updateByName(@Param("name") String name, @Param("id") Long id);

}
