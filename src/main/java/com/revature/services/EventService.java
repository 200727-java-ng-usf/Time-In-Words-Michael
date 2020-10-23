package com.revature.services;

import com.revature.models.Event;
import com.revature.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EventService {

    EventRepository eventRepository;

    public EventService() {
        super();
    }

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Transactional
    public Event save(Event event) {
        System.out.println(event);
        return eventRepository.save(event);
    }

    @Transactional
    public Event findById(Integer id) {
        Optional<Event> _event = eventRepository.findById(id);
        if (_event.isPresent()) {
            return _event.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Transactional
    public Event findByEvent(String event) {
        Optional<Event> _event = eventRepository.findByEvent(event);
        if (_event.isPresent()) {
            return _event.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Transactional
    public Event findByLocation(String location) {
        Optional<Event> _event = eventRepository.findByLocation(location);
        if (_event.isPresent()) {
            return _event.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Transactional
    public Event findByTime(LocalDateTime time) {
        Optional<Event> _event = eventRepository.findByTime(time);
        if (_event.isPresent()) {
            return _event.get();
        } else {
            throw new RuntimeException();
        }
    }


}
