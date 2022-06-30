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
public class Medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String secteur;
    private int telephone;
    private int specialite;

    @OneToOne
    @JoinColumn(name = "idDocument")
    private Document document;

    public Medecin() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Medecin(String nom, String secteur, int telephone, int specialite) {
        super();
        this.nom = nom;
        this.secteur = secteur;
        this.telephone = telephone;
        this.specialite = specialite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getSpecialite() {
        return specialite;
    }

    public void setSpecialite(int specialite) {
        this.specialite = specialite;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
