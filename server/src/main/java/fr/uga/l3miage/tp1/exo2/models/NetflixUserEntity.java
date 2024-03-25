package fr.uga.l3miage.tp1.exo2.models;

import fr.uga.l3miage.tp1.exo2.models.enums.sexClass;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="netfix_user")
public class NetflixUserEntity {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="uuid")
    private String uuid;
    @Column(name="lastname")
    private String last_name;
    @Column(name="firstname")
    private String first_name;
    @Column(name="sex")
    @Enumerated(EnumType.STRING)
    private sexClass.Sex sex;
    @Column(name="birthDate")
    private LocalDate birthDate;
    @OneToOne(mappedBy = "user")
    private NetflixAccountEntity account;


}
