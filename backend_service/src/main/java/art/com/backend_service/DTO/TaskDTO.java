package art.com.backend_service.DTO;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class TaskDTO {
    private UUID id;
    private String name;
    private String description;
    private StatusDTO status;
    private UUID storyId;
    List<ActivityDTO> activities;
}
