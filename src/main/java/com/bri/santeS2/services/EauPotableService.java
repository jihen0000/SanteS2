package com.bri.santeS2.services;

import com.bri.santeS2.entities.EauPotable;

public interface EauPotableService {
	
	public long addEauPotable(EauPotable eauPotable, long idDocument);
	public void updateEauPotable(EauPotable eauPotable);
	public EauPotable getEauPotable(long idDocument);

}
