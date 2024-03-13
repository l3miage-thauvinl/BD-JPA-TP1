package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerTypeClass;

import javax.persistence.*;
import java.time.LocalDate;

    @Entity
    public class ClassTestJPA {
        @Id
        private String myIdTest;

        private Double jpaSeed;

        private LocalDate savedAt;

        private PowerTypeClass.PowerType powerType;
    }

