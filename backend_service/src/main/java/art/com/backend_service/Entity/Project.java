package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_project;
    private String name;
    private String   description;
    @OneToMany(mappedBy = "project_id",cascade = CascadeType.ALL)
    private List<User_Project> toProjects=new ArrayList<>();
    @OneToMany(mappedBy = "project_id",cascade = CascadeType.ALL)
    private List<Sprint> sprints=new ArrayList<>();
}
