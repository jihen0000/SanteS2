package com.bri.santeS2.services;

import java.util.List;

import com.bri.santeS2.entities.Etablissement;
import com.bri.santeS2.entities.Secteur;

public interface EtablissementService {
	public long addEtablissement(Etablissement etablissement, long idGouvernoorat,long idDelegation);
	public void updateEtablissement(Etablissement etablissement);
	public void deleteEtablissement(long id);
	public Etablissement getEtablissement(long id);
	public List<Etablissement> getEtablissementByGouvernorat(long idGouvernorat);
	public List<Etablissement> getEtablissementByDelegation(long idDelegation);
	public List<Etablissement> getAllEtablissement();
	
	public List<Etablissement> getEtablissementByGouvernoratSecteur(long idGouvernorat, Secteur secteur);

}
