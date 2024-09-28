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
import java.util.Optional;
import java.util.UUID;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {

    Event findEventById_event(@Param(value = "id") UUID id);

    @Query("select e.name,e.start_time,e.end_time,e.address from Event e join Calendar c on e.id_event = c.event_id where c.user_id =: id")
    List<Event> getAllByUserId(@Param(value = "id") int id);

    @Query("delete from Event where id_event =: id")
    void deleteEventById_event(@Param(value = "id")UUID id);

    @Modifying
    @Transactional
    @Query("update Event e set e.name =: name, e.start_time =: start_time, e.end_time =:end_time, e.address =:address where e.id_event =:id")
    void updateEvent(@RequestParam(value = "name")String name,
                     @RequestParam(value = "start_time")Timestamp start_time,
                     @RequestParam(value = "end_time") Timestamp end_time,
                     @RequestParam(value = "address")String address,
                     @RequestParam(value = "id")UUID id);
}
