package com.bri.santeS2.services;

import com.bri.santeS2.entities.EtudeLoisir;

public interface EtudeLoisirService {
	public long addEtudeLoisir(EtudeLoisir etudeLoisir, long idDcoument);
	public void updateEtudeLoisir(EtudeLoisir etudeLoisir);
	public EtudeLoisir getEtudeLoisir(long idEtudeLoisir);

}
