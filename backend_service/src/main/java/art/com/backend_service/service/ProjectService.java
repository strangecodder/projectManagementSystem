package art.com.backend_service.service;

import art.com.backend_service.DTO.ProjectDTO;
import art.com.backend_service.Entity.Project;
import art.com.backend_service.Repository.ProjectRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;



    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    public Project getProject(Long id) {
        return projectRepository.findById(id).orElseThrow();
    }

    public void create(Project project) {
         projectRepository.save(project);
    }
    public void change(Long id,Project newProject){
        projectRepository.updateProjectByDescription(newProject.getDescription(), id);
        projectRepository.updateProjectByName(newProject.getName(), id);
    }
    public void delete(Long id){
        projectRepository.delete(projectRepository.findById(id).orElseThrow());
    }
}
