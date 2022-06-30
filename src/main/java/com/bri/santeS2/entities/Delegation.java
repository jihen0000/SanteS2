package com.bri.santeS2.entities;
import java.io.Serializable;
import java.util.List;

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
public class Delegation implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String libelle;

    @ManyToOne
    @JoinColumn(name="idGouvernorat")
    private Gouvernorat gouvernorat;

    @OneToMany(mappedBy = "delegation", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Etablissement> etablissements;

    public Delegation() {
            super();
            // TODO Auto-generated constructor stub
    }




    public Delegation(String libelle) {
            super();
            this.libelle = libelle;
    }




    public String getLibelle() {
            return libelle;
    }




    public void setLibelle(String libelle) {
            this.libelle = libelle;
    }




    public long getId() {
            return id;
    }
    public void setId(long id) {
            this.id = id;
    }




    public Gouvernorat getGouvernorat() {
            return gouvernorat;
    }

    public void setGouvernorat(Gouvernorat gouvernorat) {
            this.gouvernorat = gouvernorat;
    }

    public List<Etablissement> getEtablissements() {
            return etablissements;
    }

    public void setEtablissements(List<Etablissement> etablissements) {
            this.etablissements = etablissements;
    }


}
