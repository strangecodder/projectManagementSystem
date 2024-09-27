package art.com.backend_service.Entity;

import jakarta.persistence.*;
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
    @JoinColumn(name = "id_user")
    private User user_id;
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_event")
    private Event event_id;
}
