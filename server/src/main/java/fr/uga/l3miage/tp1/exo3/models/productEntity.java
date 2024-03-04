package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table(name="product_entity")
public class productEntity {
    @Id
    @Column(name="bar_code_number")
    private String bar_code_number;
    @Column(name="name")
    private String name;
    @Column(name="consumable")
    private boolean consumable;
    @ManyToOne
    private productEntity product;
}
