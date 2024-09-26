package art.com.backend_service.DTO;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class ProjectDTO {
    private UUID id;
    private String name;
    private String description;
    private List<UserDTO> users;
    private List<SprintDTO> sprints;
}
