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
@NoArgsConstructor
@AllArgsConstructor
public class Sprint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_sprint;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
    @ManyToOne()
    @JoinColumn(name = "id_project")
    private Project project_id;
    @OneToMany(mappedBy = "sprint_id",cascade = CascadeType.ALL)
    private List<Sprint_story> sprintStories=new ArrayList<>();
}
