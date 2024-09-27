package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(Sprint_StoryId.class)
public class Sprint_story implements Serializable {
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_sprint")
    private Sprint sprint_id;
    @Id
    @ManyToOne()
    @JoinColumn(name = "id_story")
    private Story story_id;
}
