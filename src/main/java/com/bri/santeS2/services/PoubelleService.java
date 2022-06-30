package com.bri.santeS2.services;

import com.bri.santeS2.entities.Poubelle;

public interface PoubelleService {
	public long addPoubelle(Poubelle poubelle,long idDocument);
	public void updatePoubelle(Poubelle poubelle);
	public Poubelle getPoubelle(long idDocument);

}
