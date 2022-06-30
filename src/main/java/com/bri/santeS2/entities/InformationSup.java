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
public class InformationSup implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    @Lob
    @Column(length=1000,name="recommendation")
    private String recommendation;
    private boolean disponibiliteSavon;
    private boolean traceInsecte;

    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;
    public InformationSup() {
        super();
        // TODO Auto-generated constructor stub
    }
    public InformationSup(String recommendation, boolean disponibiliteSavon,
                          boolean traceInsecte) {
        super();
        this.recommendation = recommendation;
        this.disponibiliteSavon = disponibiliteSavon;
        this.traceInsecte = traceInsecte;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
    public boolean isDisponibiliteSavon() {
        return disponibiliteSavon;
    }
    public void setDisponibiliteSavon(boolean disponibiliteSavon) {
        this.disponibiliteSavon = disponibiliteSavon;
    }
    public boolean isTraceInsecte() {
        return traceInsecte;
    }
    public void setTraceInsecte(boolean traceInsecte) {
        this.traceInsecte = traceInsecte;
    }
    public Document getDocument() {
        return document;
    }
    public void setDocument(Document document) {
        this.document = document;
    }


}
