package art.com.backend_service.service;

import art.com.backend_service.DTO.ProjectDTO;
import art.com.backend_service.DTO.UserDTO;
import art.com.backend_service.Entity.Project;
import art.com.backend_service.Entity.UserInfo;
import art.com.backend_service.Entity.User_Project;
import art.com.backend_service.Repository.ProjectRepository;
import art.com.backend_service.Repository.UserRepository;
import art.com.backend_service.Repository.User_projectRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final User_projectRepository userProjectRepository;
    private final UserRepository userRepository;

    public Project DTOToProject(ProjectDTO projectDTO){
        Project project=new Project();
        project.setName(projectDTO.getName());
        project.setDescription(projectDTO.getDescription());
        List<UserDTO> users=projectDTO.getUsers();
        for (UserDTO u :
                users) {
            UserInfo userInfo=userRepository.findById(u.getId()).orElseThrow();
            User_Project userProject=new User_Project();
            userProject.setProject_id(project);
            userProject.setUser_id(userInfo);
            userProjectRepository.save(userProject);
        }
        return project;
    }

    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    public Project getProject(Long id) {
        return projectRepository.findById(id).orElseThrow();
    }

    public void create(ProjectDTO project) {

        projectRepository.save(DTOToProject(project));
    }
    public void change(Long id,ProjectDTO newProject){
        projectRepository.updateProjectByDescription(newProject.getDescription(), id);
        projectRepository.updateProjectByName(newProject.getName(), id);
    }
    public void delete(Long id){
        projectRepository.delete(projectRepository.findById(id).orElseThrow());
    }
}
