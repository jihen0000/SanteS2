package com.bri.santeS2.services;

import com.bri.santeS2.entities.EtatBatiment;

public interface EtatBatimentService {
	public long addEtatBatiment(EtatBatiment etatBatiment, long idDocument);
	public void updateEtatBatiment(EtatBatiment etatBatiment);
	public EtatBatiment getEtatBatiment(long idEtatBatiment);

}
