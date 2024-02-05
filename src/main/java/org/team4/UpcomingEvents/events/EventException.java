package org.team4.UpcomingEvents.events;

public class EventException extends RuntimeException {
    
    public EventException(String message) {
        super(message);
    }

    public EventException(String message, Throwable cause) {
        super(message, cause);
    }

}
