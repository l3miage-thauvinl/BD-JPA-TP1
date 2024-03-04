package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_entity")
public class ProductEntity {
    @Id
    @Column(name="bar_code_number", length=15)
    private String bar_code_number;
    @Column(name="name")
    private String name;
    @Column(name="consumable")
    private boolean consumable;
}
