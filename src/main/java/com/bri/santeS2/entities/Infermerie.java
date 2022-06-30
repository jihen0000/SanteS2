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
public class Infermerie implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private boolean disponiblite;
    private boolean autotype;
    private boolean etatPropre;
    private boolean etatEquipee;
    private boolean secoursPrimaire;
    private boolean disponibiliteSecours;
    private boolean disponibiliteLavabos;
    private boolean sauvgardeDossier;
    private boolean autreType;
    private String autre;

    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public Infermerie() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Infermerie(boolean disponiblite, boolean autotype,
                      boolean etatPropre, boolean etatEquipee, boolean secoursPrimaire,
                      boolean disponibiliteSecours, boolean disponibiliteLavabos,
                      boolean sauvgardeDossier, boolean autreType, String autre) {
        super();
        this.disponiblite = disponiblite;
        this.autotype = autotype;
        this.etatPropre = etatPropre;
        this.etatEquipee = etatEquipee;
        this.secoursPrimaire = secoursPrimaire;
        this.disponibiliteSecours = disponibiliteSecours;
        this.disponibiliteLavabos = disponibiliteLavabos;
        this.sauvgardeDossier = sauvgardeDossier;
        this.autreType = autreType;
        this.autre = autre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDisponiblite() {
        return disponiblite;
    }

    public void setDisponiblite(boolean disponiblite) {
        this.disponiblite = disponiblite;
    }

    public boolean isAutotype() {
        return autotype;
    }

    public void setAutotype(boolean autotype) {
        this.autotype = autotype;
    }

    public boolean isEtatPropre() {
        return etatPropre;
    }

    public void setEtatPropre(boolean etatPropre) {
        this.etatPropre = etatPropre;
    }

    public boolean isEtatEquipee() {
        return etatEquipee;
    }

    public void setEtatEquipee(boolean etatEquipee) {
        this.etatEquipee = etatEquipee;
    }

    public boolean isSecoursPrimaire() {
        return secoursPrimaire;
    }

    public void setSecoursPrimaire(boolean secoursPrimaire) {
        this.secoursPrimaire = secoursPrimaire;
    }

    public boolean isDisponibiliteSecours() {
        return disponibiliteSecours;
    }

    public void setDisponibiliteSecours(boolean disponibiliteSecours) {
        this.disponibiliteSecours = disponibiliteSecours;
    }

    public boolean isDisponibiliteLavabos() {
        return disponibiliteLavabos;
    }

    public void setDisponibiliteLavabos(boolean disponibiliteLavabos) {
        this.disponibiliteLavabos = disponibiliteLavabos;
    }

    public boolean isSauvgardeDossier() {
        return sauvgardeDossier;
    }

    public void setSauvgardeDossier(boolean sauvgardeDossier) {
        this.sauvgardeDossier = sauvgardeDossier;
    }

    public boolean isAutreType() {
        return autreType;
    }

    public void setAutreType(boolean autreType) {
        this.autreType = autreType;
    }

    public String getAutre() {
        return autre;
    }

    public void setAutre(String autre) {
        this.autre = autre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
