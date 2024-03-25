package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="user")
public class UserEntity {
    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;
    @OneToOne(mappedBy = "session")
    private SessionEntity session;



}
