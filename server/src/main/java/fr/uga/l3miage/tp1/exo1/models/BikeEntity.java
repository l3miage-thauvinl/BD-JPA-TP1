package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumberClass;
import fr.uga.l3miage.tp1.exo1.enums.ShifterTypeClass;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="bike_ent")
public class BikeEntity {
    @Id
    @Column(name="immat", length=8)
    private String immatriculation;
    @Column(name="capacity")
    private Integer capacity;
    @Column(name="CylinderNumber")
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumberClass.CylinderNumber cylinderNumber;
    @Column(name="automatic")
    private boolean automatic;
    @Column(name="shifter")
    private boolean shifter;
    @Column(name="schifterType")
    @Enumerated(EnumType.STRING)
    private ShifterTypeClass.ShifterType shifterType;
    @Column(name="circulationDate")
    private LocalDate circulationDate;
}
