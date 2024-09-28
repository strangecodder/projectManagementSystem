package art.com.backend_service.service;

import art.com.backend_service.DTO.SprintDTO;
import art.com.backend_service.Entity.Sprint;
import art.com.backend_service.Repository.SprintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SprintService {
    private final SprintRepository sprintRepository;
    private final ProjectService projectService;

    public Sprint DTOToSprint(SprintDTO sprintDTO) {
        Sprint sprint =new Sprint();
        sprint.setName(sprintDTO.getName());
        sprint.setProject_id(projectService.getProject(sprintDTO.getId()));
        sprint.setEnd_date(sprintDTO.getEndDate());
        sprint.setStart_date(sprintDTO.getStartDate());
        return sprint;
    }

    public List<Sprint> getAllSprint(Long pid) {
        return sprintRepository.findAllByProject_id(pid);
    }

    public void create(SprintDTO sprint) {
        sprintRepository.save(DTOToSprint(sprint));
    }

    public Sprint getSprint(Long id) {
        return sprintRepository.findById(id).orElseThrow();
    }

    public void deleteSprint(Long id) {
        sprintRepository.delete(sprintRepository.findById(id).orElseThrow());
    }

    public void change(Long id, SprintDTO newSprint) {
        sprintRepository.updateByName(newSprint.getName(), id);
        sprintRepository.updateByEnd_date(newSprint.getEndDate(), id);
        sprintRepository.updateByStart_date(newSprint.getStartDate(), id);
    }
}
