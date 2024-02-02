package org.team4.UpcomingEvents.events;

import java.util.List;



public class EventService {

    EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAll() {
        List<Event> events =eventRepository.findAll();
        return events;
        
    }

    public Event getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }


    }
