package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;
@Entity
public class DeveloperEntity {
    @Id
    @Column(name = "lastName")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "email")
    private String email;


    @ManyToMany
    private Set<ProjetEntity> projetEntities;
}