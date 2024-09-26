package art.com.backend_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Status_activity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_status_activity;
    private String name;
    private String description;
    @OneToMany(mappedBy = "statusActivity_id",cascade = CascadeType.ALL)
    private List<Activity> activities=new ArrayList<>();
}
