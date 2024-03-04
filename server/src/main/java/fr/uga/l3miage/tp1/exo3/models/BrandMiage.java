package fr.uga.l3miage.tp1.exo3.models;

import org.h2.command.dml.Set;

import javax.persistence.*;

@Entity
@Table(name="brand_miage")
public class BrandMiage {
    @Id
    @Column(name="compagny_name")
    private String compagnyName;
    @Column(name="siretNumber", length=11)
    private String siretNumber;
    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private String type;
    @OneToMany
    private Set<BrandMiage> brands;
}
