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
@DiscriminatorValue(value = "DR")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Draps extends ElementChambre{
    public Draps() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Draps(boolean nombreAdequat, boolean etatPropre, boolean etatActive) {
        super(nombreAdequat, etatPropre, etatActive);
        // TODO Auto-generated constructor stub
    }

}
