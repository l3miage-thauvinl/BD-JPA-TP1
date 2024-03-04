package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="NetflixUserEntity")
@Table(name="netfix_user")
public class netflixUser {
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
    private String sex;
    @Column(name="birthDate")
    private LocalDate birthDate;
    @OneToOne(mappedBy = "user")
    private netflixAccount account;


}
