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
public class Infermier implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nom;
    private boolean residant;
    private String typeTravail;

    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;


    public Infermier() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Infermier(String nom, boolean residant, String typeTravail) {
        super();
        this.nom = nom;
        this.residant = residant;
        this.typeTravail = typeTravail;
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

    public boolean isResidant() {
        return residant;
    }

    public void setResidant(boolean residant) {
        this.residant = residant;
    }

    public String getTypeTravail() {
        return typeTravail;
    }

    public void setTypeTravail(String typeTravail) {
        this.typeTravail = typeTravail;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
