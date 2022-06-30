package com.bri.santeS2.services;

import com.bri.santeS2.entities.ElementSante;
import com.bri.santeS2.entities.Lavabos;
import com.bri.santeS2.entities.Robinets;
import com.bri.santeS2.entities.Toilettes;
import com.bri.santeS2.entities.Urinoirs;

public interface ElementSanteService {
	
	public long addElementSante(ElementSante elementSante, long idDocument);

	public void updateElementSante(ElementSante elementSante);

	public Robinets getRoubinets(long idDocument);

	public Urinoirs getUrinoirs(long idDocument);

	public Toilettes getToilettes(long idDocument);

	public Lavabos getLavabos(long idDocument);

}
