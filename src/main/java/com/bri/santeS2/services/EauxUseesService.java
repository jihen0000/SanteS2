package com.bri.santeS2.services;

import com.bri.santeS2.entities.EauxUsees;

public interface EauxUseesService {
	public long addEauxUsees(EauxUsees eauxUsees, long idDocument);
	public void updateEauxUsees(EauxUsees eauxUsees);
	public EauxUsees getEauxUsees(long idDocument);

}
