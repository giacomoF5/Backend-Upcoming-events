package org.team4.upcomingevents.events;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "${api-endpoint}/events")

public class EventController {

    EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping(path = "")
    public List<Event> index() {
        List<Event> events = eventService.getAll();
        return events;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Event> show(@NonNull @PathVariable("id") Long id) throws Exception {
        Event event = eventService.getById(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(event);
    }

}
