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
public class Urinoirs extends ElementSante {
    public Urinoirs() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Urinoirs(boolean etatPresent, int nombrePresent,
                    boolean etatNombreAdequat, int nombreAdequat,
                    boolean etatUtilisation, int nombreUtilisation, boolean etatPropre,
                    int nombrePropre) {
        super(etatPresent, nombrePresent, etatNombreAdequat, nombreAdequat,
                etatUtilisation, nombreUtilisation, etatPropre, nombrePropre);
        // TODO Auto-generated constructor stub
    }

}
