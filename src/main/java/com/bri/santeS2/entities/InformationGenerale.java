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
public class InformationGenerale implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String telephone;
    private String fax;
    private String nomDirecteur;
    private boolean celluleEcoute;
    private boolean celluleSante;
    private boolean permanencesMedicale;

    private int nombreIndiv;
    private int nombreBinome;
    private int nombreTrinome;
    private int nombreAutreType;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public InformationGenerale() {
        super();
        // TODO Auto-generated constructor stub
    }



    public InformationGenerale(String nom, String telephone, String fax,
                               String nomDirecteur, boolean celluleEcoute, boolean celluleSante,
                               boolean permanencesMedicale, int nombreIndiv, int nombreBinome,
                               int nombreTrinome, int nombreAutreType) {
        super();

        this.telephone = telephone;
        this.fax = fax;
        this.nomDirecteur = nomDirecteur;
        this.celluleEcoute = celluleEcoute;
        this.celluleSante = celluleSante;
        this.permanencesMedicale = permanencesMedicale;
        this.nombreIndiv = nombreIndiv;
        this.nombreBinome = nombreBinome;
        this.nombreTrinome = nombreTrinome;
        this.nombreAutreType = nombreAutreType;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }





    public String getTelephone() {
        return telephone;
    }



    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }



    public String getFax() {
        return fax;
    }



    public void setFax(String fax) {
        this.fax = fax;
    }



    public String getNomDirecteur() {
        return nomDirecteur;
    }

    public void setNomDirecteur(String nomDirecteur) {
        this.nomDirecteur = nomDirecteur;
    }

    public boolean isCelluleEcoute() {
        return celluleEcoute;
    }

    public void setCelluleEcoute(boolean celluleEcoute) {
        this.celluleEcoute = celluleEcoute;
    }

    public boolean isCelluleSante() {
        return celluleSante;
    }

    public void setCelluleSante(boolean celluleSante) {
        this.celluleSante = celluleSante;
    }

    public boolean isPermanencesMedicale() {
        return permanencesMedicale;
    }

    public void setPermanencesMedicale(boolean permanencesMedicale) {
        this.permanencesMedicale = permanencesMedicale;
    }



    public int getNombreIndiv() {
        return nombreIndiv;
    }



    public void setNombreIndiv(int nombreIndiv) {
        this.nombreIndiv = nombreIndiv;
    }



    public int getNombreBinome() {
        return nombreBinome;
    }



    public void setNombreBinome(int nombreBinome) {
        this.nombreBinome = nombreBinome;
    }



    public int getNombreTrinome() {
        return nombreTrinome;
    }



    public void setNombreTrinome(int nombreTrinome) {
        this.nombreTrinome = nombreTrinome;
    }



    public int getNombreAutreType() {
        return nombreAutreType;
    }



    public void setNombreAutreType(int nombreAutreType) {
        this.nombreAutreType = nombreAutreType;
    }



    public Document getDocument() {
        return document;
    }



    public void setDocument(Document document) {
        this.document = document;
    }


}
