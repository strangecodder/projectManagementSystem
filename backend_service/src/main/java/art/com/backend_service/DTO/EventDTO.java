package art.com.backend_service.DTO;

import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
public class EventDTO {
    private String name;
    private Timestamp start_time;
    private Timestamp end_time;
    private String address;
}
