package art.com.backend_service.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class Sprint_StoryId implements Serializable {
    private Sprint sprint_id;
    private Story story_id;
}
