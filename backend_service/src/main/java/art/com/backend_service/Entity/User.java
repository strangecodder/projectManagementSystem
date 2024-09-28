package art.com.backend_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id_user;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private String git_nick;
    @ManyToOne()
    private DepartmentInfo department_id;
    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<User_Project> toProjects=new ArrayList<>();
    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<Calendar> calendars =new ArrayList<>();
    @OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
    private List<Activity> activities =new ArrayList<>();
}
