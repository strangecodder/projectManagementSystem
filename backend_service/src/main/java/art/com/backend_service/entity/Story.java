package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Story implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_story;
    private String name;
    private String description;
    @OneToMany(mappedBy = "story_id",cascade = CascadeType.ALL)
    List<Task> tasks=new ArrayList<>();
    @OneToMany(mappedBy = "story_id",cascade = CascadeType.ALL)
    List<Sprint_story> sprintStories=new ArrayList<>();
}
