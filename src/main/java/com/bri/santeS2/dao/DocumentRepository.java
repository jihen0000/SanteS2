package com.bri.santeS2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.*;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long>{
	
	@Query("SELECT d FROM Document d where(d.id = :idDocument)")
	public Document getById(@Param("idDocument") long idDocument);
	
	@Query("SELECT d FROM Document d where ((d.etablissement.id = :idEtablissement) and (d.annee = :annee))")
    public List<Document> getDocumentByIdEtablissementAndAnnee(@Param("idEtablissement") long idEtablissement,@Param("annee") String annee);

    @Query("SELECT d FROM Document d where d.etablissement.id = :idEtablissement")
    public List<Document> getDocumentsByIdEtablissement(@Param("idEtablissement") long idEtablissement);

    @Query("SELECT d FROM Document d where d.annee = :annee")
    public List<Document> getDocumentsByAnnee(@Param("annee") String annee);

    @Query("SELECT DISTINCT d.annee FROM Document d where d.etablissement.id = :idEtablissement")
    public List<String> getListAnneeByIdEtablissement(@Param("idEtablissement") long idEtablissement);

    @Query("select d  from Document d, Etablissement e, Gouvernorat g  where ((d.etablissement.id=e.id) and (e.gouvernorat.id=g.id) and (g.id= :idGouvernorat))")
    public List<Document> getDocumentsByGov(@Param("idGouvernorat") long idGouvernorat);

    @Query("select d  from Document d, Etablissement e, Delegation dele  where ((d.etablissement.id=e.id) and (e.delegation.id=dele.id) and (dele.id= :idDelegation))")
    public List<Document> getDocumentsByDelegation(@Param("idDelegation") long idDelegation);

    @Query("SELECT d FROM Document d WHERE ((d.etablissement.id= :idEtablissement) and (d.annee = :annee) and (d.typeVisite= :typeVisite))")
    public Document getDocumentAnneeTypeVisite(@Param("idEtablissement") long idEtablissement,@Param("annee") String annee,@Param("typeVisite") TypeVisite typeVisite);

    @Query("select DISTINCT  d.annee from Document d where d.etablissement.gouvernorat.id= :idGouvernorat")
    public List<String> getAnneesByGouvernorat(long idGouvernorat);

    @Query("select d from Document d where (( d.etablissement.gouvernorat.id= :idGouvernorat) and (d.annee= :annee) and (d.etablissement.secteur= :secteur) and (d.typeVisite= :typeVisite))")
    public List<Document> getListDocumentAnneeTypeVisiteSecteur(@Param("annee") String annee, @Param("typeVisite") TypeVisite typeVisite, @Param("secteur")Secteur secteur,@Param("idGouvernorat") long idGouvernorat);

    @Query("select DISTINCT  d.annee from Document d where (( d.etablissement.gouvernorat.id= :idGouvernorat) and (d.etablissement.secteur= :secteur) and (d.typeVisite= :typeVisite))")
    public List<String> getAnneesByGouvernoratVisiteSecteur(@Param("idGouvernorat") long idGouvernorat,@Param("typeVisite") TypeVisite typeVisite,@Param("secteur") Secteur secteur);

    @Query("select   d from Document d where (( d.etablissement.gouvernorat.id= :idGouvernorat) and (d.etablissement.secteur= :secteur) and (d.typeVisite= :typeVisite))")
    public List<Document> docissam(@Param("idGouvernorat") long idGouvernorat,@Param("typeVisite") TypeVisite typeVisite,@Param("secteur") Secteur secteur);

}
