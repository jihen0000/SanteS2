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
public class CuisineResidant implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    private boolean disponibliteCuisisne;
    private int nombreCuisisne;
    private boolean disponibliteRefregirateur;
    private int nombrerefregirateur;
    private boolean repasResidant;
    private boolean repasChambre;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public CuisineResidant() {
        super();
        // TODO Auto-generated constructor stub
    }

    public CuisineResidant(boolean disponibliteCuisisne, int nombreCuisisne,
                           boolean disponibliteRefregirateur, int nombrerefregirateur,
                           boolean repasResidant, boolean repasChambre) {
        super();
        this.disponibliteCuisisne = disponibliteCuisisne;
        this.nombreCuisisne = nombreCuisisne;
        this.disponibliteRefregirateur = disponibliteRefregirateur;
        this.nombrerefregirateur = nombrerefregirateur;
        this.repasResidant = repasResidant;
        this.repasChambre = repasChambre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isDisponibliteCuisisne() {
        return disponibliteCuisisne;
    }

    public void setDisponibliteCuisisne(boolean disponibliteCuisisne) {
        this.disponibliteCuisisne = disponibliteCuisisne;
    }

    public int getNombreCuisisne() {
        return nombreCuisisne;
    }

    public void setNombreCuisisne(int nombreCuisisne) {
        this.nombreCuisisne = nombreCuisisne;
    }

    public boolean isDisponibliteRefregirateur() {
        return disponibliteRefregirateur;
    }

    public void setDisponibliteRefregirateur(boolean disponibliteRefregirateur) {
        this.disponibliteRefregirateur = disponibliteRefregirateur;
    }

    public int getNombrerefregirateur() {
        return nombrerefregirateur;
    }

    public void setNombrerefregirateur(int nombrerefregirateur) {
        this.nombrerefregirateur = nombrerefregirateur;
    }

    public boolean isRepasResidant() {
        return repasResidant;
    }

    public void setRepasResidant(boolean repasResidant) {
        this.repasResidant = repasResidant;
    }

    public boolean isRepasChambre() {
        return repasChambre;
    }

    public void setRepasChambre(boolean repasChambre) {
        this.repasChambre = repasChambre;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
