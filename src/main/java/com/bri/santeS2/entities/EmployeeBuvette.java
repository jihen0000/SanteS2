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
public class EmployeeBuvette implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean vetementsTrav;
    private boolean etatPropreVet;
    private boolean capCheveux;
    private boolean barbeRase;
    private boolean onglesUntrimmed;
    private boolean rayures_;
    private boolean consultationMedicale;
    private boolean analyseMedicale;
    private boolean analyseFecales;
    private boolean analyseNezGorge;
    private boolean analyseExpectorations;
    private boolean carnetSante;
    private boolean sauvgardeAnalyse;
    @OneToOne
    @JoinColumn(name="idBuvette")
    private Buvette buvette;

    public EmployeeBuvette() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EmployeeBuvette(boolean vetementsTrav, boolean etatPropreVet,
                           boolean capCheveux, boolean barbeRase, boolean onglesUntrimmed,
                           boolean rayures_, boolean consultationMedicale,
                           boolean analyseFecales, boolean analyseNezGorge,
                           boolean analyseExpectorations, boolean carnetSante,
                           boolean sauvgardeAnalyse) {
        super();
        this.vetementsTrav = vetementsTrav;
        this.etatPropreVet = etatPropreVet;
        this.capCheveux = capCheveux;
        this.barbeRase = barbeRase;
        this.onglesUntrimmed = onglesUntrimmed;
        this.rayures_ = rayures_;
        this.consultationMedicale = consultationMedicale;
        this.analyseFecales = analyseFecales;
        this.analyseNezGorge = analyseNezGorge;
        this.analyseExpectorations = analyseExpectorations;
        this.carnetSante = carnetSante;
        this.sauvgardeAnalyse = sauvgardeAnalyse;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public boolean isEtatPropreVet() {
        return etatPropreVet;
    }

    public void setEtatPropreVet(boolean etatPropreVet) {
        this.etatPropreVet = etatPropreVet;
    }

    public boolean isCapCheveux() {
        return capCheveux;
    }

    public void setCapCheveux(boolean capCheveux) {
        this.capCheveux = capCheveux;
    }

    public boolean isBarbeRase() {
        return barbeRase;
    }

    public void setBarbeRase(boolean barbeRase) {
        this.barbeRase = barbeRase;
    }

    public boolean isOnglesUntrimmed() {
        return onglesUntrimmed;
    }

    public void setOnglesUntrimmed(boolean onglesUntrimmed) {
        this.onglesUntrimmed = onglesUntrimmed;
    }

    public boolean isRayures_() {
        return rayures_;
    }

    public void setRayures_(boolean rayures_) {
        this.rayures_ = rayures_;
    }

    public boolean isConsultationMedicale() {
        return consultationMedicale;
    }

    public void setConsultationMedicale(boolean consultationMedicale) {
        this.consultationMedicale = consultationMedicale;
    }

    public boolean isAnalyseFecales() {
        return analyseFecales;
    }

    public void setAnalyseFecales(boolean analyseFecales) {
        this.analyseFecales = analyseFecales;
    }

    public boolean isAnalyseNezGorge() {
        return analyseNezGorge;
    }

    public void setAnalyseNezGorge(boolean analyseNezGorge) {
        this.analyseNezGorge = analyseNezGorge;
    }

    public boolean isAnalyseExpectorations() {
        return analyseExpectorations;
    }

    public void setAnalyseExpectorations(boolean analyseExpectorations) {
        this.analyseExpectorations = analyseExpectorations;
    }



    public boolean isSauvgardeAnalyse() {
        return sauvgardeAnalyse;
    }

    public void setSauvgardeAnalyse(boolean sauvgardeAnalyse) {
        this.sauvgardeAnalyse = sauvgardeAnalyse;
    }

    public Buvette getBuvette() {
        return buvette;
    }

    public void setBuvette(Buvette buvette) {
        this.buvette = buvette;
    }

    public boolean isVetementsTrav() {
        return vetementsTrav;
    }

    public void setVetementsTrav(boolean vetementsTrav) {
        this.vetementsTrav = vetementsTrav;
    }

    public boolean isCarnetSante() {
        return carnetSante;
    }

    public void setCarnetSante(boolean carnetSante) {
        this.carnetSante = carnetSante;
    }

    public boolean isAnalyseMedicale() {
        return analyseMedicale;
    }

    public void setAnalyseMedicale(boolean analyseMedicale) {
        this.analyseMedicale = analyseMedicale;
    }


}
