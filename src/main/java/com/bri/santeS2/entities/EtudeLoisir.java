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
public class EtudeLoisir implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private boolean sallevision;
    private boolean salleLoisir;
    private boolean clubSante;
    private boolean stadeSport;
    private boolean equipeSport;
    private boolean jardin;
    private boolean envExterne;
    @OneToOne
    @JoinColumn(name="idDocument")
    private Document document;

    public EtudeLoisir() {
        super();
        // TODO Auto-generated constructor stub
    }

    public EtudeLoisir(boolean sallevision, boolean salleLoisir,
                       boolean clubSante, boolean stadeSport, boolean equipeSport,
                       boolean jardin, boolean envExterne) {
        super();
        this.sallevision = sallevision;
        this.salleLoisir = salleLoisir;
        this.clubSante = clubSante;
        this.stadeSport = stadeSport;
        this.equipeSport = equipeSport;
        this.jardin = jardin;
        this.envExterne = envExterne;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isSallevision() {
        return sallevision;
    }

    public void setSallevision(boolean sallevision) {
        this.sallevision = sallevision;
    }

    public boolean isSalleLoisir() {
        return salleLoisir;
    }

    public void setSalleLoisir(boolean salleLoisir) {
        this.salleLoisir = salleLoisir;
    }

    public boolean isClubSante() {
        return clubSante;
    }

    public void setClubSante(boolean clubSante) {
        this.clubSante = clubSante;
    }

    public boolean isStadeSport() {
        return stadeSport;
    }

    public void setStadeSport(boolean stadeSport) {
        this.stadeSport = stadeSport;
    }

    public boolean isEquipeSport() {
        return equipeSport;
    }

    public void setEquipeSport(boolean equipeSport) {
        this.equipeSport = equipeSport;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isEnvExterne() {
        return envExterne;
    }

    public void setEnvExterne(boolean envExterne) {
        this.envExterne = envExterne;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }


}
