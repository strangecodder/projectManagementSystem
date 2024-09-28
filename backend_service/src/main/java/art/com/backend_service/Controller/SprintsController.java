package art.com.backend_service.Controller;

import art.com.backend_service.DTO.SprintDTO;
import art.com.backend_service.Entity.Project;
import art.com.backend_service.Entity.Sprint;
import art.com.backend_service.service.SprintService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects/{pid}/sprint")
@RequiredArgsConstructor
public class SprintsController {
    private final SprintService service;

    @GetMapping()
    public ResponseEntity<List<Sprint>> allSprint(@PathVariable("pid") Long pid) {
        final List<Sprint> list = service.getAllSprint(pid);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> createProject(@PathVariable("pid") Long pid, @RequestBody SprintDTO sprint) {
        service.create(sprint);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sprint> project(@PathVariable("id") Long id, @PathVariable("pid") Long pid) {
        Sprint sprint = service.getSprint(id);
        return new ResponseEntity<>(sprint, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateProject(@PathVariable("id") Long id, @RequestBody SprintDTO sprint, @PathVariable("pid") Long pid) {
        service.change(id, sprint);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id, @PathVariable("pid") Long pid) {
        service.deleteSprint(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
