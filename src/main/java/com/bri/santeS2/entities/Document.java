package com.bri.santeS2.entities;
import java.io.Serializable;
import java.util.Date;
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
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String annee;
    private Date dateVisite;
    @Enumerated(EnumType.STRING)
    private TypeVisite typeVisite;



    private String nomMedecin;
    private String nomInfermier;
    @ManyToOne
    @JoinColumn(name="idEtablissement")
    private Etablissement etablissement;



    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private EauxUsees eauxUsees;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private CuisineResidant cuisineResidant;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Infermerie infermerie;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Poubelle poubelle;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private EtudeLoisir etudeLoisir;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private InformationGenerale infoGenerale;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Hebergement hebergement;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private EtatBatiment etatBatiment;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private EauPotable eauPotable;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Buvette buvette;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Infermier infermier;

    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Medecin medecin;
    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Visiteur> visiteurs;

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<ElementSante> elementSantes;

    @OneToMany(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<ElementChambre> elementChambres;
    @OneToOne(mappedBy = "document", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private InformationSup informationSup;

    public Document() {
        super();
        // TODO Auto-generated constructor stub
    }



    public Document(String annee, Date dateVisite, TypeVisite typeVisite,
                    String nomMedecin,
                    String nomInfermier) {
        super();
        this.annee = annee;
        this.dateVisite = dateVisite;
        this.typeVisite = typeVisite;


        this.nomMedecin = nomMedecin;
        this.nomInfermier = nomInfermier;
    }



    public TypeVisite getTypeVisite() {
        return typeVisite;
    }

    public void setTypeVisite(TypeVisite typeVisite) {
        this.typeVisite = typeVisite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public InformationGenerale getInfoGenerale() {
        return infoGenerale;
    }

    public void setInfoGenerale(InformationGenerale infoGenerale) {
        this.infoGenerale = infoGenerale;
    }

    public Infermier getInfermier() {
        return infermier;
    }

    public void setInfermier(Infermier infermier) {
        this.infermier = infermier;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Hebergement getHebergement() {
        return hebergement;
    }

    public void setHebergement(Hebergement hebergement) {
        this.hebergement = hebergement;
    }

    public EtatBatiment getEtatBatiment() {
        return etatBatiment;
    }

    public void setEtatBatiment(EtatBatiment etatBatiment) {
        this.etatBatiment = etatBatiment;
    }

    public List<Visiteur> getVisiteurs() {
        return visiteurs;
    }

    public void setVisiteurs(List<Visiteur> visiteurs) {
        this.visiteurs = visiteurs;
    }

    public EauPotable getEauPotable() {
        return eauPotable;
    }

    public void setEauPotable(EauPotable eauPotable) {
        this.eauPotable = eauPotable;
    }

    public Buvette getBuvette() {
        return buvette;
    }

    public void setBuvette(Buvette buvette) {
        this.buvette = buvette;
    }

    public EauxUsees getEauxUsees() {
        return eauxUsees;
    }

    public void setEauxUsees(EauxUsees eauxUsees) {
        this.eauxUsees = eauxUsees;
    }

    public CuisineResidant getCuisineResidant() {
        return cuisineResidant;
    }

    public void setCuisineResidant(CuisineResidant cuisineResidant) {
        this.cuisineResidant = cuisineResidant;
    }

    public Infermerie getInfermerie() {
        return infermerie;
    }

    public void setInfermerie(Infermerie infermerie) {
        this.infermerie = infermerie;
    }

    public Poubelle getPoubelle() {
        return poubelle;
    }

    public void setPoubelle(Poubelle poubelle) {
        this.poubelle = poubelle;
    }

    public EtudeLoisir getEtudeLoisir() {
        return etudeLoisir;
    }

    public void setEtudeLoisir(EtudeLoisir etudeLoisir) {
        this.etudeLoisir = etudeLoisir;
    }

    public List<ElementSante> getElementSantes() {
        return elementSantes;
    }

    public void setElementSantes(List<ElementSante> elementSantes) {
        this.elementSantes = elementSantes;
    }

    public List<ElementChambre> getElementChambres() {
        return elementChambres;
    }

    public void setElementChambres(List<ElementChambre> elementChambres) {
        this.elementChambres = elementChambres;
    }


    public InformationSup getInformationSup() {
        return informationSup;
    }

    public void setInformationSup(InformationSup informationSup) {
        this.informationSup = informationSup;
    }




    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public String getNomInfermier() {
        return nomInfermier;
    }

    public void setNomInfermier(String nomInfermier) {
        this.nomInfermier = nomInfermier;
    }



    public Etablissement getEtablissement() {
        return etablissement;
    }



    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }


}
