package com.bri.santeS2.services;

import com.bri.santeS2.entities.Medecin;

public interface MedecinService {
	public long addMedecin(Medecin  medecin, long idDocument);
	public Medecin getMedecin(long idDocument);
	public void updateMedecin(Medecin medecin);

}
