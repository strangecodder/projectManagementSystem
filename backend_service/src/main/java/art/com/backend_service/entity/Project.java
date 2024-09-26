package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_project;
    private String name;
    private String   description;
    @OneToMany(mappedBy = "project_id",cascade = CascadeType.ALL)
    private List<User_Project> toProjects=new ArrayList<>();
    @OneToMany(mappedBy = "project_id",cascade = CascadeType.ALL)
    private List<Sprint> sprints=new ArrayList<>();
}
