package com.revature.repository;

import com.revature.models.Event;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Integer> {

    Optional<Event> findById(Integer id);

    Optional<Event> findByEvent(String event);

    Optional<Event> findByLocation(String location);

    Optional<Event> findByTime(LocalDateTime time);
}
