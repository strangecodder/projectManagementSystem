package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sprint implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_sprint;
    private String name;
    private LocalDate start_date;
    private LocalDate end_date;
    @ManyToOne()
    private Project project_id;
    @OneToMany(mappedBy = "sprint_id",cascade = CascadeType.ALL)
    private List<Sprint_story> sprintStories=new ArrayList<>();
}
