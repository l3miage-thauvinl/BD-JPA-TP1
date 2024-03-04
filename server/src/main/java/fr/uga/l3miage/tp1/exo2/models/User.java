package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="idUser")
    private Long idUser;
    @Column(name="sso")
    private boolean SSO;
    @Column(name="last_connexion")
    private OffsetDateTime lastConnexion;

    @OneToOne
    private Session session;



}
