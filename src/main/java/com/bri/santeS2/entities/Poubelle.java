package com.bri.santeS2.entities;
import java.io.Serializable;

import javax.persistence.*;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@CrossOrigin(origins = "*")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Poubelle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean presencePoubelle;
    private boolean etatPropre;
    private boolean etatFermee;
    private boolean utilisationSac;
    private boolean endroitLever;
    private boolean endroitPropre;

    @OneToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="idDocument")
    private Document document;

    public Poubelle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Poubelle(boolean presencePoubelle, boolean etatPropre,
                    boolean etatFermee, boolean utilisationSac, boolean endroitLever,
                    boolean endroitPropre) {
        super();
        this.presencePoubelle = presencePoubelle;
        this.etatPropre = etatPropre;
        this.etatFermee = etatFermee;
        this.utilisationSac = utilisationSac;
        this.endroitLever = endroitLever;
        this.endroitPropre = endroitPropre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPresencePoubelle() {
        return presencePoubelle;
    }

    public void setPresencePoubelle(boolean presencePoubelle) {
        this.presencePoubelle = presencePoubelle;
    }

    public boolean isEtatPropre() {
        return etatPropre;
    }

    public void setEtatPropre(boolean etatPropre) {
        this.etatPropre = etatPropre;
    }

    public boolean isEtatFermee() {
        return etatFermee;
    }

    public void setEtatFermee(boolean etatFermee) {
        this.etatFermee = etatFermee;
    }

    public boolean isUtilisationSac() {
        return utilisationSac;
    }

    public void setUtilisationSac(boolean utilisationSac) {
        this.utilisationSac = utilisationSac;
    }

    public boolean isEndroitLever() {
        return endroitLever;
    }

    public void setEndroitLever(boolean endroitLever) {
        this.endroitLever = endroitLever;
    }

    public boolean isEndroitPropre() {
        return endroitPropre;
    }

    public void setEndroitPropre(boolean endroitPropre) {
        this.endroitPropre = endroitPropre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
