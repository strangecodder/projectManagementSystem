package art.com.backend_service.DTO;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class EventDTO {
    private String name;
    private Timestamp start_time;
    private Timestamp end_time;
    private String address;
}
