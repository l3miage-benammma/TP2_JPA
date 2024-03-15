package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

public class DeveloperEntity {
    @Id
    @Column(name = "lastName")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "email")
    private String email;

    @Column(name = "projetEntities")
    @ManyToMany(mappedBy = "developerEntities")
    private Set<ProjetEntity> projetEntities;
}