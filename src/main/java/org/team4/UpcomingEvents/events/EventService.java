package org.team4.UpcomingEvents.events;

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
        List<Event> events =repository.findAll();
        return events;
        
    }

    public Event getById(@NonNull Long id) throws Exception {

    Event event = repository.findById(id).orElseThrow(() -> new EventNotFoundException("Event not found"));
        return event;
    }

    public Event save(@NonNull Event event) {
        
        Event newCountry = repository.save(event);
        return newCountry;
    }



    }
