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
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_ELEMENT", discriminatorType = DiscriminatorType.STRING,length = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ElementSante implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean etatPresent;
    private int nombrePresent;
    private boolean etatNombreAdequat;
    private int nombreAdequat;
    private boolean etatUtilisation;
    private int nombreUtilisation;
    private boolean etatPropre;
    private int nombrePropre;

    @ManyToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public ElementSante() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ElementSante(boolean etatPresent, int nombrePresent,
                        boolean etatNombreAdequat, int nombreAdequat,
                        boolean etatUtilisation, int nombreUtilisation, boolean etatPropre,
                        int nombrePropre) {
        super();
        this.etatPresent = etatPresent;
        this.nombrePresent = nombrePresent;
        this.etatNombreAdequat = etatNombreAdequat;
        this.nombreAdequat = nombreAdequat;
        this.etatUtilisation = etatUtilisation;
        this.nombreUtilisation = nombreUtilisation;
        this.etatPropre = etatPropre;
        this.nombrePropre = nombrePropre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isEtatPresent() {
        return etatPresent;
    }

    public void setEtatPresent(boolean etatPresent) {
        this.etatPresent = etatPresent;
    }

    public int getNombrePresent() {
        return nombrePresent;
    }

    public void setNombrePresent(int nombrePresent) {
        this.nombrePresent = nombrePresent;
    }

    public boolean isEtatNombreAdequat() {
        return etatNombreAdequat;
    }

    public void setEtatNombreAdequat(boolean etatNombreAdequat) {
        this.etatNombreAdequat = etatNombreAdequat;
    }

    public int getNombreAdequat() {
        return nombreAdequat;
    }

    public void setNombreAdequat(int nombreAdequat) {
        this.nombreAdequat = nombreAdequat;
    }

    public boolean isEtatUtilisation() {
        return etatUtilisation;
    }

    public void setEtatUtilisation(boolean etatUtilisation) {
        this.etatUtilisation = etatUtilisation;
    }

    public int getNombreUtilisation() {
        return nombreUtilisation;
    }

    public void setNombreUtilisation(int nombreUtilisation) {
        this.nombreUtilisation = nombreUtilisation;
    }

    public boolean isEtatPropre() {
        return etatPropre;
    }

    public void setEtatPropre(boolean etatPropre) {
        this.etatPropre = etatPropre;
    }

    public int getNombrePropre() {
        return nombrePropre;
    }

    public void setNombrePropre(int nombrePropre) {
        this.nombrePropre = nombrePropre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
