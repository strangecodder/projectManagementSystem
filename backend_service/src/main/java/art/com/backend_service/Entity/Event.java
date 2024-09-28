package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_event;
    private String name;
    private Timestamp start_time;
    private Timestamp end_time;
    private String address;
    @OneToMany(mappedBy = "event_id",cascade = CascadeType.ALL)
    private List<Calendar> calendars=new ArrayList<>();
}
