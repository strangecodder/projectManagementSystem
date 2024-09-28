package art.com.backend_service.Controller;

import art.com.backend_service.DTO.EventDTO;
import art.com.backend_service.Entity.Event;
import art.com.backend_service.service.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@AllArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping
    public List<Event> getSchedule(@RequestParam(value = "username")String username){
        return scheduleService.getEventDtoByUserId(username);
    }

    @PostMapping
    public Event createEvent(EventDTO eventDTO){
        return scheduleService.createEvent(eventDTO);
    }

    @PatchMapping("/{id}")
    public HttpEntity<Object> editEvent(@RequestParam(value = "id") UUID id, EventDTO eventDTO){
        scheduleService.editEvent(eventDTO,id);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<Object> deleteEvent(@RequestParam(value = "id") UUID id){
        scheduleService.deleteById(id);
        return ResponseEntity.ok().body(HttpStatus.OK);
    }
}
