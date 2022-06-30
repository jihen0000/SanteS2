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
public class Hebergement implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private int nombreMale;
    private int nombreFemale;
    private int nombreLits;
    private int nombreBatiment;
    private int nombreEmployee;
    private int nombreMenege;
    private boolean vetement;
    private boolean propre;

    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public Hebergement() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Hebergement( int nombreMale, int nombreFemale,
                        int nombreFamille, int nombreBatiment, int nombreEmployee,
                        int nombreMenege, boolean vetement, boolean propre) {
        super();

        this.nombreMale = nombreMale;
        this.nombreFemale = nombreFemale;
        this.nombreLits = nombreFamille;
        this.nombreBatiment = nombreBatiment;
        this.nombreEmployee = nombreEmployee;
        this.nombreMenege = nombreMenege;
        this.vetement = vetement;
        this.propre = propre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public int getNombreMale() {
        return nombreMale;
    }

    public void setNombreMale(int nombreMale) {
        this.nombreMale = nombreMale;
    }

    public int getNombreFemale() {
        return nombreFemale;
    }

    public void setNombreFemale(int nombreFemale) {
        this.nombreFemale = nombreFemale;
    }



    public int getNombreBatiment() {
        return nombreBatiment;
    }

    public void setNombreBatiment(int nombreBatiment) {
        this.nombreBatiment = nombreBatiment;
    }

    public int getNombreEmployee() {
        return nombreEmployee;
    }

    public void setNombreEmployee(int nombreEmployee) {
        this.nombreEmployee = nombreEmployee;
    }

    public int getNombreMenege() {
        return nombreMenege;
    }

    public void setNombreMenege(int nombreMenege) {
        this.nombreMenege = nombreMenege;
    }

    public boolean isVetement() {
        return vetement;
    }

    public void setVetement(boolean vetement) {
        this.vetement = vetement;
    }

    public boolean getPropre() {
        return propre;
    }

    public void setPropre(boolean propre) {
        this.propre = propre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public int getNombreLits() {
        return nombreLits;
    }

    public void setNombreLits(int nombreLits) {
        this.nombreLits = nombreLits;
    }


}
