package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.BrandTypeClass;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brand_miage")
public class brandMiage {
    @Id
    @Column(name="compagny_name")
    private String compagny_name;
    @Column(name="siretNumber")
    private String siretNumber;
    @Column(name="BrandType")
    @Enumerated(EnumType.STRING)
    private BrandTypeClass.BrandType type;

    @OneToMany(mappedBy = "product")
    private Set<productEntity> brand;
}
