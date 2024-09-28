package art.com.backend_service.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
public class SprintDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private UUID projectId;
    private List<StoryDTO> stories;
}
