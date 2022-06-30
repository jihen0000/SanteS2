package com.bri.santeS2.services;

import com.bri.santeS2.entities.Buvette;

public interface BuvetteService {
	public long addBuvette(Buvette buvette, long idDocument);
	public void updateBuvette(Buvette buvette);
	public Buvette getBuvette(long idDocument);

}
