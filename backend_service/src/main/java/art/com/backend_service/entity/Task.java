package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_task;
    private String name;
    private String description;
    @ManyToOne()
    private Story story_id;
    @ManyToOne()
    private Status status_id;
    @OneToMany(mappedBy = "task_id",cascade = CascadeType.ALL)
    private List<Activity> activities=new ArrayList<>();

}
