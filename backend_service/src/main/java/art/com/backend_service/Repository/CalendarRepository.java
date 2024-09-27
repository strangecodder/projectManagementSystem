package art.com.backend_service.Repository;

import art.com.backend_service.Entity.Calendar;
import art.com.backend_service.Entity.CalendarId;
import art.com.backend_service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, CalendarId> {
}
