package com.cke.reservationsystembackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "salonRendered")
public class SalonRendered {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private SalonService salonService;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "appintmentId")
    private Appintment appintment;


}
