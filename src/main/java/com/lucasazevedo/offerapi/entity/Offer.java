package com.lucasazevedo.offerapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "offer")
@Setter
@Getter
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column
    private BigDecimal value;

    @Column
    private Long amount;

    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
