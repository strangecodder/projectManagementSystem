package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id_activity;
    @ManyToOne()
    private Task task_id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne()
    private User user_id;
    @ManyToOne
    private Status_activity statusActivity_id;
}
