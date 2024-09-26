package art.com.backend_service.DTO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ActivityDTO {
    private UUID id;
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long duration;
    private UserDTO user; // todo: or user id??
    private StatusActivityDTO activity;
}
