package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.CylinderNumberClass;
import fr.uga.l3miage.tp1.exo1.enums.ShifterTypeClass;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class BikeEntity {
    @Id
    private String immatriculation;
    private Integer capacity;
    @Enumerated(EnumType.ORDINAL)
    private CylinderNumberClass.CylinderNumber cylinderNumber;
    private boolean automatic;
    private boolean shifter;
    @Enumerated(EnumType.STRING)
    private ShifterTypeClass.ShifterType shifterType;
    private LocalDate circulationDate;
}
