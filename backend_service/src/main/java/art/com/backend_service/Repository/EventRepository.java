package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Event;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    @Query("select e from Event e where e.id_event = :id")
    Event findEventById_event(@Param(value = "id") UUID id);

    @Query("SELECT e FROM Event e JOIN Calendar c WHERE c.user_id = :id")
    List<Event> getAllByUserId(@Param(value = "id") int id);

    @Query("delete from Event where id_event =:id")
    void deleteEventById_event(@Param(value = "id") UUID id);

    @Modifying
    @Transactional
    @Query("update Event e set e.name = :name, e.start_time = :start_time, e.end_time = :end_time, e.address = :address where e.id_event = :id")
    void updateEvent(@Param(value = "name")String name,
                     @Param(value = "start_time") Timestamp start_time,
                     @Param(value = "end_time") Timestamp end_time,
                     @Param(value = "address")String address,
                     @Param(value = "id")UUID id);
}
