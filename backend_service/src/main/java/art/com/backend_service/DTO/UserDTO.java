package art.com.backend_service.DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String git_nick;
}
