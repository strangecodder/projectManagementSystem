package art.com.backend_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
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
    private Sprint sprint_id;
    @Id
    @ManyToOne()
    private Story story_id;
}
