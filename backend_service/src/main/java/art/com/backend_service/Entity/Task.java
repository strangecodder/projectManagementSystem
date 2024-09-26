package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_task;
    private String name;
    private String description;
    @ManyToOne()
    private Story story_id;
    @ManyToOne()
    private Status status_id;
    @OneToMany(mappedBy = "task_id",cascade = CascadeType.ALL)
    private List<Activity> activities=new ArrayList<>();

}
