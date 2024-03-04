package fr.uga.l3miage.tp1.exo3.models;

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
    private String type;

    @OneToMany(mappedBy = "product")
    private Set<brandMiage> brand;
}
