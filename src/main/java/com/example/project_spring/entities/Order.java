package com.example.project_spring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant dateMoment;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private User client;

    public Order() {}

    public Order(Long id, Instant dateMoment, User client) {
        this.id = id;
        this.dateMoment = dateMoment;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDateMoment() {
        return dateMoment;
    }

    public void setDateMoment(Instant dateMoment) {
        this.dateMoment = dateMoment;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
