package art.com.backend_service.Controller;

import art.com.backend_service.DTO.TaskDTO;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping("")
    public List<TaskDTO> getTasks(){
        return null;
    }

    @GetMapping("/{id:.+}")
    public TaskDTO getTask(UUID id){
        return null;
    }

    @PostMapping
    public HttpEntity<Objects> createTask(TaskDTO taskDTO) {
        return null;
    }

    @PatchMapping
    public HttpEntity<Objects> updateTask(TaskDTO taskDTO) {
        return null;
    }

    @DeleteMapping
    public HttpEntity<Objects> deleteTask(UUID id) {
        return null;
    }
}
