package fr.uga.l3miage.tp1.exo3.models;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandEntity {
    @Id
    @Column(name="compagny_name")
    private String compagnyName;
    @Column(name="siretNumber", length=11)
    private String siretNumber;
    @Column(name="type")
    @Enumerated(EnumType.STRING)
    private String type;
    @OneToMany(mappedBy = "brand")
    private Set<ProductEntity> products;
}
