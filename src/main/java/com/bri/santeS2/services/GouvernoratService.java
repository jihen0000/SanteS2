package com.bri.santeS2.services;

import java.util.List;

import com.bri.santeS2.entities.Gouvernorat;

public interface GouvernoratService {
	public List<Gouvernorat> getAllGouvernorat();
	public Gouvernorat addGouvernorat(Gouvernorat gouvernorat);
	public boolean checkAvailableGouvernorat(String libille);
	public void deleteGouvernorat(long idGouvernorat);
	public void updateGouvernorat(Gouvernorat gouvernorat);

}
