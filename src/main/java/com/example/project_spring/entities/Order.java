package com.example.project_spring.entities;

import com.example.project_spring.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",timezone = "GMT")
    private Instant dateMoment;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "clientId")
    private User client;

    private Integer statusPayment;

    public Order() {}

    public Order(Long id, Instant dateMoment,OrderStatus statusPayment, User client) {
        this.id = id;
        this.dateMoment = dateMoment;
        setStatusPayment(statusPayment);
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

    public OrderStatus getStatusPayment() {
        return OrderStatus.status(statusPayment);
    }

    public void setStatusPayment(OrderStatus statusPayment) {
        this.statusPayment = statusPayment.getValue();
    }

    public void setClient(User client) {
        this.client = client;
    }
}
