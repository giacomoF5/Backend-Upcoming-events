package org.team4.UpcomingEvents.events;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping(path = "${api-endpoint}/events")


public class EventController {

EventService eventService;

public EventController(EventService eventService){
    this.eventService = eventService;

}

/* @GetMapping(path = "") 

    public List<Event> index() {
        
    
} */
}









