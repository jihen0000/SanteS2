package com.bri.santeS2.services;

import com.bri.santeS2.entities.Infermerie;

public interface InfermerieService {
	public long addInfermerie(Infermerie infermerie,long idDocument);
	public void updateInfermerie(Infermerie infermerie);
	public Infermerie getInfermerie(long idInfermerie);

}
