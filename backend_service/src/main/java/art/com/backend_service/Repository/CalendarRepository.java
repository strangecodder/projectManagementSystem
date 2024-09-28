package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Calendar;
import art.com.backend_service.Entity.CalendarId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, CalendarId> {
}
