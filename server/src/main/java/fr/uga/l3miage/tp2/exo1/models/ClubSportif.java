package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ClubSportif {
    @Id
    private Long id;
    private String nom;
    private String description;
    @ManyToMany
    private Set<Etudiant> etudiants;
}