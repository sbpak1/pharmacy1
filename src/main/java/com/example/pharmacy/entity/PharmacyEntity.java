package com.example.pharmacy.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pharmacy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PharmacyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double latitude;
    private double longitude;
    private double distance;
}
