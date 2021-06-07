package com.sharkit.maxup.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "response")
public class ResponseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy HH:mm")
    @Column(updatable = false)
    private LocalDate time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity userE;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public UsersEntity getUserE() {
        return userE;
    }

    public void setUserE(UsersEntity userE) {
        this.userE = userE;
    }
}
