package com.bri.santeS2.services;

import com.bri.santeS2.entities.Bureau;
import com.bri.santeS2.entities.Chaises;
import com.bri.santeS2.entities.Draps;
import com.bri.santeS2.entities.ElementChambre;
import com.bri.santeS2.entities.Matelas;
import com.bri.santeS2.entities.Rangements;

public interface ElementChambreService {
	
	public long addElementChambre(ElementChambre elementChambre, long idDocument);

	public void updateElementChambre(ElementChambre elementChambre);

	public Matelas getMatelas(long idDocument);

	public Draps getDraps(long idDocument);

	public Rangements getRangements(long idDocument);

	public Bureau getBureau(long idDocument);

	public Chaises getChaise(long idChaise);

}
