package com.example.events.entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

public class Message {
    private Long id;
    private Chat chat;
    private String textMsg;

    @ManyToOne
    @JoinColumn(name = "authorMsg", nullable = false)
    private User authorMsg;

    private LocalDateTime created;
    private boolean isDeleted;
}
