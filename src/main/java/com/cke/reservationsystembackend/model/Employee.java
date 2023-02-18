package com.cke.reservationsystembackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.java.Log;

@Entity
@Data
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id ;
    private String firstName;
    private String lastName;
}
