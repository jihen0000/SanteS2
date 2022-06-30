package com.bri.santeS2.services;

import com.bri.santeS2.entities.Hebergement;

public interface HebergementService {
	public long addHebergement(Hebergement hebergement,long idDocument);
	public void updateHebergement(Hebergement hebergement);
	public Hebergement getHebergement(long idHebergement);

}
