package art.com.backend_service.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class CalendarId implements Serializable {
    private UserInfo user_id;
    private Event event_id;
}
