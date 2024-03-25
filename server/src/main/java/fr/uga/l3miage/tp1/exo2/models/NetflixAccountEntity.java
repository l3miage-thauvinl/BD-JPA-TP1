package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.typeAccountClass;

import javax.persistence.*;

@Entity
@Table(name="netflix_account")
public class NetflixAccountEntity {
    @Id
    @Column(name="id")
    private Long id;
    @Column(name="nb_devices")
    private Integer nbDevice;
    @Column(name="typeAccount")
    @Enumerated(EnumType.STRING)
    private typeAccountClass.TypeAccount typeAccount;
    @OneToOne
    @JoinColumn(name="uuid_user", referencedColumnName = "uuid")
    private NetflixUserEntity user;

}
