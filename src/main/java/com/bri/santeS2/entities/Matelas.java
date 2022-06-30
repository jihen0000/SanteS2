package com.bri.santeS2.entities;

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
public class Matelas extends ElementChambre {
    public Matelas() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Matelas(boolean nombreAdequat, boolean etatPropre, boolean etatActive) {
        super(nombreAdequat, etatPropre, etatActive);
        // TODO Auto-generated constructor stub
    }

}
