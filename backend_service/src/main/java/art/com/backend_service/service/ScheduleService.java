package art.com.backend_service.service;

import art.com.backend_service.DTO.EventDTO;
import art.com.backend_service.Entity.Event;
import art.com.backend_service.Repository.EventRepository;
import art.com.backend_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
public class ScheduleService {

    private EventRepository eventRepository;
    private UserRepository userRepository;

    public ScheduleService(EventRepository eventRepository){
        this.eventRepository = eventRepository;
    }

    public List<Event> getEventDtoByUserId(String username){
        return eventRepository.getAllByUserId(userRepository.getIdByUsername(username));
    }

    public Event createEvent(@RequestBody EventDTO eventDTO){
        Event event = new Event();
        event.setName(eventDTO.getName());
        event.setStart_time(eventDTO.getStart_time());
        event.setEnd_time(eventDTO.getEnd_time());
        event.setAddress(eventDTO.getAddress());
        return eventRepository.save(event);
    }

    public void deleteById(UUID id){
        eventRepository.deleteEventById_event(id);
    }

    public void editEvent(EventDTO eventDTO,UUID id){
        eventRepository.updateEvent(eventDTO.getName(),
                eventDTO.getStart_time(),
                eventDTO.getEnd_time(),
                eventDTO.getAddress(),
                id);
    }

    public Event findById(UUID id){
        return eventRepository.findEventById_event(id);
    }

}
