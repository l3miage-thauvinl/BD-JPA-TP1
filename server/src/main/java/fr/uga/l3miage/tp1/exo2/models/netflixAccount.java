package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.typeAccountClass;

import javax.persistence.*;

@Entity(name="NetflixAccountEntity")
@Table(name="netflix_account")
public class netflixAccount {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="nb_devices")
    private Integer nbDevice;
    @Column(name="typeAccount")
    @Enumerated(EnumType.STRING)
    private typeAccountClass.TypeAccount typeAccount;
    @OneToOne
    private netflixUser user;

}
