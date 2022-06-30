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
public class EtatBatiment implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean etatMurs;
    private boolean peinture;
    private String fissure;
    private String humidite;
    private boolean ventilation;
    private boolean eclirage;
    private boolean eclirageArt;
    private boolean generateurCourant;
    private boolean soriteSecours;
    private boolean extincteur;
    private boolean insuffisances;
    private String manqueSecurite;

    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public EtatBatiment() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EtatBatiment(boolean etatMurs, boolean peinture, String fissure,
                        String humidite, boolean ventilation, boolean eclirage,
                        boolean eclirageArt, boolean generateurCourant,
                        boolean soriteSecours, boolean extincteur, String manqueSecurite) {
        super();
        this.etatMurs = etatMurs;
        this.peinture = peinture;
        this.fissure = fissure;
        this.humidite = humidite;
        this.ventilation = ventilation;
        this.eclirage = eclirage;
        this.eclirageArt = eclirageArt;
        this.generateurCourant = generateurCourant;
        this.soriteSecours = soriteSecours;
        this.extincteur = extincteur;
        this.manqueSecurite = manqueSecurite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEtatMurs() {
        return etatMurs;
    }

    public void setEtatMurs(boolean etatMurs) {
        this.etatMurs = etatMurs;
    }

    public boolean isPeinture() {
        return peinture;
    }

    public void setPeinture(boolean peinture) {
        this.peinture = peinture;
    }

    public String getFissure() {
        return fissure;
    }

    public void setFissure(String fissure) {
        this.fissure = fissure;
    }

    public String getHumidite() {
        return humidite;
    }

    public void setHumidite(String humidite) {
        this.humidite = humidite;
    }



    public boolean isVentilation() {
        return ventilation;
    }

    public void setVentilation(boolean ventilation) {
        this.ventilation = ventilation;
    }

    public boolean isEclirage() {
        return eclirage;
    }

    public void setEclirage(boolean eclirage) {
        this.eclirage = eclirage;
    }

    public boolean isEclirageArt() {
        return eclirageArt;
    }

    public void setEclirageArt(boolean eclirageArt) {
        this.eclirageArt = eclirageArt;
    }

    public boolean isGenerateurCourant() {
        return generateurCourant;
    }

    public void setGenerateurCourant(boolean generateurCourant) {
        this.generateurCourant = generateurCourant;
    }

    public boolean isSoriteSecours() {
        return soriteSecours;
    }

    public void setSoriteSecours(boolean soriteSecours) {
        this.soriteSecours = soriteSecours;
    }

    public boolean isExtincteur() {
        return extincteur;
    }

    public void setExtincteur(boolean extincteur) {
        this.extincteur = extincteur;
    }

    public String getManqueSecurite() {
        return manqueSecurite;
    }

    public void setManqueSecurite(String manqueSecurite) {
        this.manqueSecurite = manqueSecurite;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public boolean isInsuffisances() {
        return insuffisances;
    }

    public void setInsuffisances(boolean insuffisances) {
        this.insuffisances = insuffisances;
    }


}
