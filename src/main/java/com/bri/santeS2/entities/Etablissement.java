package com.bri.santeS2.entities;
import java.io.Serializable;
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
public class Etablissement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String tel;
    private String fax;

    @Enumerated(EnumType.STRING)
    private Secteur secteur;
    @OneToMany(mappedBy="etablissement",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    private List<Document> documents;

    @ManyToOne
    @JoinColumn(name = "idGouvernorat")
    private Gouvernorat gouvernorat;

    @ManyToOne
    @JoinColumn(name = "idDelegation")
    private Delegation delegation;
    public Etablissement() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Etablissement(String nom, String tel, String fax) {
        super();
        this.nom = nom;
        this.tel = tel;
        this.fax = fax;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getFax() {
        return fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public List<Document> getDocuments() {
        return documents;
    }
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
    public Gouvernorat getGouvernorat() {
        return gouvernorat;
    }
    public void setGouvernorat(Gouvernorat gouvernorat) {
        this.gouvernorat = gouvernorat;
    }
    public Delegation getDelegation() {
        return delegation;
    }
    public void setDelegation(Delegation delegation) {
        this.delegation = delegation;
    }
    public Secteur getSecteur() {
        return secteur;
    }
    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }


}
