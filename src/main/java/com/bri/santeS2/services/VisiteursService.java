package com.bri.santeS2.services;

import java.util.List;

import com.bri.santeS2.entities.Visiteur;

public interface VisiteursService {
	public long addVisiteur(Visiteur  visiteur,long idDocument);
	public void addVisiteurs(List<Visiteur> visiteurs,long idDocument);
	public List<Visiteur> getVisiteurs(long idDocument);

}
