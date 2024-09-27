package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_activity;
    @ManyToOne()
    @JoinColumn(name = "id_task")
    private Task task_id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne()
    @JoinColumn(name = "id_user")
    private User user_id;
    @ManyToOne
    @JoinColumn(name = "id_status_activity")
    private Status_activity statusActivity_id;
}
