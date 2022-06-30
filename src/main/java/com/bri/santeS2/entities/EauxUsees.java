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
public class EauxUsees implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean presenceONAS;
    private boolean eauStagnanteCuis;
    private boolean puitsPerdu;
    private boolean fosseSeptique;
    private boolean etatRejet;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public EauxUsees() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EauxUsees(boolean presenceONAS, boolean eauStagnanteCuis,
                     boolean puitsPerdu, boolean fosseSeptique, boolean etatRejet) {
        super();
        this.presenceONAS = presenceONAS;
        this.eauStagnanteCuis = eauStagnanteCuis;
        this.puitsPerdu = puitsPerdu;
        this.fosseSeptique = fosseSeptique;
        this.etatRejet = etatRejet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPresenceONAS() {
        return presenceONAS;
    }

    public void setPresenceONAS(boolean presenceONAS) {
        this.presenceONAS = presenceONAS;
    }

    public boolean isEauStagnanteCuis() {
        return eauStagnanteCuis;
    }

    public void setEauStagnanteCuis(boolean eauStagnanteCuis) {
        this.eauStagnanteCuis = eauStagnanteCuis;
    }

    public boolean isPuitsPerdu() {
        return puitsPerdu;
    }

    public void setPuitsPerdu(boolean puitsPerdu) {
        this.puitsPerdu = puitsPerdu;
    }

    public boolean isFosseSeptique() {
        return fosseSeptique;
    }

    public void setFosseSeptique(boolean fosseSeptique) {
        this.fosseSeptique = fosseSeptique;
    }

    public boolean isEtatRejet() {
        return etatRejet;
    }

    public void setEtatRejet(boolean etatRejet) {
        this.etatRejet = etatRejet;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
