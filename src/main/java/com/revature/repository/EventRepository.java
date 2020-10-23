package com.revature.repository;

import com.revature.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

    Optional<Event> findById(Integer id);

    Optional<Event> findByEvent(String event);

    Optional<Event> findByLocation(String location);

    Optional<Event> findByTime(LocalDateTime time);
}
