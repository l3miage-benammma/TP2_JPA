package fr.uga.l3miage.tp2.exo3.models;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Commande {
    @Id
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private double montantTotal;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande")
    private List<Produit> produits;
}
