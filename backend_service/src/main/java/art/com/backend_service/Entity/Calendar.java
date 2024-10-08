package art.com.backend_service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CalendarId.class)
public class Calendar implements Serializable {
    @Id
    @ManyToOne()
    private User user_id;
    @Id
    @ManyToOne()
    private Event event_id;
}
