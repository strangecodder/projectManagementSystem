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
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Story implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id_story;
    private String name;
    private String description;
    @OneToMany(mappedBy = "story_id")
    List<Task> tasks=new ArrayList<>();
    @OneToMany(mappedBy = "story_id")
    List<Sprint_story> sprintStories=new ArrayList<>();
}
