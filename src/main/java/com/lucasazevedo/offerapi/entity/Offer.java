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
    @SequenceGenerator(name = "offer_seq", sequenceName = "offer_seq", allocationSize = 1)
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
