package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_activity;
    @ManyToOne()
    private Task task_id;
    private String name;
    private LocalDate time;
    @ManyToOne()
    private User user_id;
    @ManyToOne
    private Status_activity statusActivity_id;
}
