package com.bri.santeS2.services;

import java.util.List;

import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Secteur;
import com.bri.santeS2.entities.TypeVisite;

public interface DocumentService {
	public long addDocument(Document document, long idEtablissement);
	public void updateDocument(Document document);
	public Document getDocument(long idDocument);
	public void deleteDocument(long idDocument);
	
	
	public List<Document> getDocumentsByAnnee(String Annee);
	public List<String> getListAnnee(long idEtablissement);
	
	
	public List<Document> getDocumentsByGov(long idGovernorat);
	public List<Document> getDocumentsByDelegation(long idDelegation);
	public List<Document> getDocumentsByEtablissemnt(long idEtablissemnt);
	public List<Document> getDocuments(long idEtablissemnt,String annee);
	
	public Document getDocumentAnneeTypeVisite(long idEtablissemnt,String annee,TypeVisite typeVisite);
	
	public List<Document> getListDocumentAnneeTypeVisiteSecteur(String annee,TypeVisite typeVisite,Secteur secteur,long idGouvernorat);
	
	public List<String> getAnneesByGouvernorat(long idGouvernorat);
	
	public List<String> getAnneesByGouvernoratVisiteSecteur(long idGouvernorat,TypeVisite typeVisite,Secteur secteur );
}
