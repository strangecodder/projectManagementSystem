package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ToProjectId.class)
public class User_Project implements Serializable {
    @Id
    @ManyToOne()
    private UserInfo user_id;
    @Id
    @ManyToOne()
    private Project project_id;
}
