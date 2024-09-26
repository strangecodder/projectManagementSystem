package art.com.backend_service.DTO;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class StoryDTO {
    private UUID id;
    private String name;
    private String description;
    private List<TaskDTO> tasks;
    private UUID storyId;
}
