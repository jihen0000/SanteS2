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
public class Buvette implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String responsable;
    private int nombreEmployee;
    private boolean etatMurs;
    private boolean murs180;
    private boolean etatVentilation;
    private boolean etatEclerage;
    private boolean presenceMoustiquaire;
    private boolean etatPropre;
    private boolean presence3Lav;
    private boolean etatEquipement;
    private boolean presenceLav;
    private boolean presenceRefregirateur;
    private boolean etatUtilRef;
    private boolean etatPropreRef;
    private boolean presenceInsectes;
    private boolean platsChauds;
    private boolean platsFroids;
    private boolean alimentsImpropres;
    private boolean rmqAlimentsImpropres;
    private boolean repasBuvette;
    private boolean congelation;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    @OneToOne(mappedBy="buvette",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private EmployeeBuvette employeeBuvette;

    public Buvette() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Buvette(String responsable, int nombreEmployee, boolean etatMurs,
                   boolean murs180, boolean etatVentilation, boolean etatEclerage,
                   boolean presenceMoustiquaire, boolean etatPropre,
                   boolean presence3Lav, boolean etatEquipement, boolean presenceLav,
                   boolean presenceRefregirateur, boolean etatUtilRef,
                   boolean etatPropreRef, boolean presenceInsectes,
                   boolean platsChauds, boolean platsFroids,
                   boolean alimentsImpropres, boolean rmqAlimentsImpropres) {
        super();
        this.responsable = responsable;
        this.nombreEmployee = nombreEmployee;
        this.etatMurs = etatMurs;
        this.murs180 = murs180;
        this.etatVentilation = etatVentilation;
        this.etatEclerage = etatEclerage;
        this.presenceMoustiquaire = presenceMoustiquaire;
        this.etatPropre = etatPropre;
        this.presence3Lav = presence3Lav;
        this.etatEquipement = etatEquipement;
        this.presenceLav = presenceLav;
        this.presenceRefregirateur = presenceRefregirateur;
        this.etatUtilRef = etatUtilRef;
        this.etatPropreRef = etatPropreRef;
        this.presenceInsectes = presenceInsectes;
        this.platsChauds = platsChauds;
        this.platsFroids = platsFroids;
        this.alimentsImpropres = alimentsImpropres;
        this.rmqAlimentsImpropres = rmqAlimentsImpropres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getNombreEmployee() {
        return nombreEmployee;
    }

    public void setNombreEmployee(int nombreEmployee) {
        this.nombreEmployee = nombreEmployee;
    }

    public boolean isEtatMurs() {
        return etatMurs;
    }

    public void setEtatMurs(boolean etatMurs) {
        this.etatMurs = etatMurs;
    }

    public boolean isMurs180() {
        return murs180;
    }

    public void setMurs180(boolean murs180) {
        this.murs180 = murs180;
    }

    public boolean isEtatVentilation() {
        return etatVentilation;
    }

    public void setEtatVentilation(boolean etatVentilation) {
        this.etatVentilation = etatVentilation;
    }

    public boolean isEtatEclerage() {
        return etatEclerage;
    }

    public void setEtatEclerage(boolean etatEclirage) {
        this.etatEclerage = etatEclirage;
    }

    public boolean isPresenceMoustiquaire() {
        return presenceMoustiquaire;
    }

    public void setPresenceMoustiquaire(boolean presenceMoustiquaire) {
        this.presenceMoustiquaire = presenceMoustiquaire;
    }

    public boolean isEtatPropre() {
        return etatPropre;
    }

    public void setEtatPropre(boolean etatPropre) {
        this.etatPropre = etatPropre;
    }

    public boolean isPresence3Lav() {
        return presence3Lav;
    }

    public void setPresence3Lav(boolean presence3Lav) {
        this.presence3Lav = presence3Lav;
    }

    public boolean isEtatEquipement() {
        return etatEquipement;
    }

    public void setEtatEquipement(boolean etatEquipement) {
        this.etatEquipement = etatEquipement;
    }

    public boolean isPresenceLav() {
        return presenceLav;
    }

    public void setPresenceLav(boolean presenceLav) {
        this.presenceLav = presenceLav;
    }

    public boolean isPresenceRefregirateur() {
        return presenceRefregirateur;
    }

    public void setPresenceRefregirateur(boolean presenceRefregirateur) {
        this.presenceRefregirateur = presenceRefregirateur;
    }

    public boolean isEtatUtilRef() {
        return etatUtilRef;
    }

    public void setEtatUtilRef(boolean etatUtilRef) {
        this.etatUtilRef = etatUtilRef;
    }

    public boolean isEtatPropreRef() {
        return etatPropreRef;
    }

    public void setEtatPropreRef(boolean etatPropreRef) {
        this.etatPropreRef = etatPropreRef;
    }

    public boolean isPresenceInsectes() {
        return presenceInsectes;
    }

    public void setPresenceInsectes(boolean presenceInsectes) {
        this.presenceInsectes = presenceInsectes;
    }

    public boolean isPlatsChauds() {
        return platsChauds;
    }

    public void setPlatsChauds(boolean platsChauds) {
        this.platsChauds = platsChauds;
    }

    public boolean isPlatsFroids() {
        return platsFroids;
    }

    public void setPlatsFroids(boolean platsFroids) {
        this.platsFroids = platsFroids;
    }

    public boolean isAlimentsImpropres() {
        return alimentsImpropres;
    }

    public void setAlimentsImpropres(boolean alimentsImpropres) {
        this.alimentsImpropres = alimentsImpropres;
    }




    public boolean isRmqAlimentsImpropres() {
        return rmqAlimentsImpropres;
    }

    public void setRmqAlimentsImpropres(boolean rmqAlimentsImpropres) {
        this.rmqAlimentsImpropres = rmqAlimentsImpropres;
    }

    public boolean isRepasBuvette() {
        return repasBuvette;
    }

    public void setRepasBuvette(boolean repasBuvette) {
        this.repasBuvette = repasBuvette;
    }

    public EmployeeBuvette getEmployeeBuvette() {
        return employeeBuvette;
    }

    public void setEmployeeBuvette(EmployeeBuvette employeeBuvette) {
        this.employeeBuvette = employeeBuvette;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public boolean isCongelation() {
        return congelation;
    }

    public void setCongelation(boolean congelation) {
        this.congelation = congelation;
    }


}
