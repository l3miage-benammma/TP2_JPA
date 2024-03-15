package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.math.BigInteger;
import java.util.Set;

public class ProjetEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "developerEntities")
    @ManyToMany
    private Set<DeveloperEntity> developerEntities;
}