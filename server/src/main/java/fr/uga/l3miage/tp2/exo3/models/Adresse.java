package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Adresse {
    @Id
    private Long id;
    private String rue;
    private String numero;
    private String codePostal;
    private String ville;
}
