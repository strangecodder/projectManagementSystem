package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
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
    @Column(name = "id")
    private Long id_event;
    private String name;
    private LocalDate start_time;
    private LocalDate end_time;
    private String address;
    @OneToMany(mappedBy = "event_id",cascade = CascadeType.ALL)
    private List<Calendar> calendars=new ArrayList<>();
}
