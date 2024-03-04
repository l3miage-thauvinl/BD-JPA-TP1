package fr.uga.l3miage.tp1.exo1.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="car_porsche")
public class CarEntity {
    @Id
    @Column(name="immat", length=8)
    private  String immatriculation;
    @Column(name="cyl_cap")
    private double cylinderCapacity;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "weight_unity")
    @Enumerated(EnumType.STRING)
    private Integer weightUnity;
    @Column(name = "torque")
    private Integer torque;
    @Column(name ="power")
    private Integer power;
    @Column(name ="power_type")
    @Enumerated(EnumType.ORDINAL)
    private Integer powerType;
    @Column(name= "circulation_date")
    private LocalDate circulationDate;
}
