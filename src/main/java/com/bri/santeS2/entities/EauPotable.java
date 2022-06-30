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
public class EauPotable implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean reseauDistribution;
    private boolean autreReseau;
    private boolean controleReseau;
    private String nomReseau;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public EauPotable() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EauPotable(boolean reseauDistribution, boolean autreReseau,
                      boolean controleReseau, String nomReseau) {
        super();
        this.reseauDistribution = reseauDistribution;
        this.autreReseau = autreReseau;
        this.controleReseau = controleReseau;
        this.nomReseau = nomReseau;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isReseauDistribution() {
        return reseauDistribution;
    }

    public void setReseauDistribution(boolean reseauDistribution) {
        this.reseauDistribution = reseauDistribution;
    }

    public boolean isAutreReseau() {
        return autreReseau;
    }

    public void setAutreReseau(boolean autreReseau) {
        this.autreReseau = autreReseau;
    }

    public boolean isControleReseau() {
        return controleReseau;
    }

    public void setControleReseau(boolean controleReseau) {
        this.controleReseau = controleReseau;
    }

    public String getNomReseau() {
        return nomReseau;
    }

    public void setNomReseau(String nomReseau) {
        this.nomReseau = nomReseau;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
