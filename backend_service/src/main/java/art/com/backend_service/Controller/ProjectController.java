package art.com.backend_service.Controller;

import art.com.backend_service.DTO.ProjectDTO;
import art.com.backend_service.Entity.Project;
import art.com.backend_service.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {
   private final ProjectService projectService;

    @GetMapping()
    public ResponseEntity<List<Project>> allProject(){
        final List<Project> list=projectService.getAllProject();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<?>  createProject(@RequestBody ProjectDTO projectDTO){
        projectService.create(projectDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Project> project(@PathVariable("id") Long id){
        Project project = projectService.getProject(id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateProject(@PathVariable("id") Long id,@RequestBody ProjectDTO project){
        projectService.change(id,project);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
