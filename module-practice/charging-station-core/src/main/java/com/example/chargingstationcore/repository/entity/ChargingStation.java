package com.example.chargingstationcore.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "ev_station")
@Getter
public class ChargingStation implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "ev_station_name")
    private String name;

    @Column(name = "create_date")
    private Date createDate;
}
