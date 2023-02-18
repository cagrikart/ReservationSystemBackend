package com.cke.reservationsystembackend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "salonService")
@Data
public class SalonService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date SalonDuration;

    private Double price;
    private Double materials;
    


}
