package com.bri.santeS2.services;

import com.bri.santeS2.entities.Infermier;

public interface InfermierService {
	public long addInfermier(Infermier  infermier, long idDocument);
	public Infermier getInfermier(long idDocument);
	public void updateInfermier(Infermier infermier);

}
