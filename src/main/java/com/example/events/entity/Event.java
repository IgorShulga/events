package com.example.events.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

public class Event {


    private Long id;


    private String name;


    private LocalDateTime dateEvent;

    private Set<User> participants;

    private Chat chat;

    private User stageManager;
    private TypeEvent typeEvent;
    private String location;
    private String notes;
}
