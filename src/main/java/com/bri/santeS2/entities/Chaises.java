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
@DiscriminatorValue(value = "CH")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Chaises extends ElementChambre{
    public Chaises(boolean nombreAdequat, boolean etatPropre, boolean etatActive) {
        super(nombreAdequat, etatPropre, etatActive);
        // TODO Auto-generated constructor stub
    }

    public Chaises() {
        super();
        // TODO Auto-generated constructor stub
    }

}
