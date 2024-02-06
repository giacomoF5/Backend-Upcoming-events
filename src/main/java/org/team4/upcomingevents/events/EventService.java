package org.team4.upcomingevents.events;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    EventRepository repository;

    public EventService(EventRepository eventRepository) {
        this.repository = eventRepository;
    }

    public List<Event> getAll() {
        List<Event> events = repository.findAll();
        return events;

    }

    public Event getById(@NonNull Long id) throws Exception {

        Event event = repository.findById(id).orElseThrow(() -> new EventNotFoundException("Event not found"));
        return event;
    }

    public void save(EventDto eventDto) throws Exception {
        
        try {
            Event newEvent = Event.builder()
                                .title(eventDto.getTitle())
                                .date(eventDto.getDate())
                                .hour(eventDto.getHour())
                                .place(eventDto.getPlace())
                                .description(eventDto.getDescription())
                                .build();
    
            repository.save(newEvent);
        } catch (Exception e) {
            throw new Exception("Error al guardar en base de datos" + e.getMessage());
        }

    }

}
