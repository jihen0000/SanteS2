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
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_ELEMENT",discriminatorType = DiscriminatorType.STRING,length = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ElementChambre implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean nombreAdequat;
    private boolean etatPropre;
    private boolean etatActive;

    @ManyToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public ElementChambre() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ElementChambre(boolean nombreAdequat, boolean etatPropre,
                          boolean etatActive) {
        super();
        this.nombreAdequat = nombreAdequat;
        this.etatPropre = etatPropre;
        this.etatActive = etatActive;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isNombreAdequat() {
        return nombreAdequat;
    }

    public void setNombreAdequat(boolean nombreAdequat) {
        this.nombreAdequat = nombreAdequat;
    }

    public boolean isEtatPropre() {
        return etatPropre;
    }

    public void setEtatPropre(boolean etatPropre) {
        this.etatPropre = etatPropre;
    }

    public boolean isEtatActive() {
        return etatActive;
    }

    public void setEtatActive(boolean etatActive) {
        this.etatActive = etatActive;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
