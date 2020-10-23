package com.revature.models;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String event;

    @Column
    private String location;

    @Column
    private LocalDateTime time;

    public Event() {
        super();
    }

    public Event(String event, String location, LocalDateTime time) {
        this.event = event;
        this.location = location;
        this.time = time;
    }

    public Event(int id, String event, String location, LocalDateTime time) {
        this.id = id;
        this.event = event;
        this.location = location;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event1 = (Event) o;
        return id == event1.id &&
                Objects.equals(event, event1.event) &&
                Objects.equals(location, event1.location) &&
                Objects.equals(time, event1.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, event, location, time);
    }

    @Override
    public String toString() {
        return "EventController{" +
                "id=" + id +
                ", event='" + event + '\'' +
                ", location='" + location + '\'' +
                ", time=" + time +
                '}';
    }
}
