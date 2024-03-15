package fr.uga.l3miage.tp2.exo2.models;

import org.hibernate.hql.internal.ast.tree.BinaryLogicOperatorNode;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="post")
public class Employe {
    @Id
    private Long id;
    private String nom;
    private String email;
    private double salaire;
}