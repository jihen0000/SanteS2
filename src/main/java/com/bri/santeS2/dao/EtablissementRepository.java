package com.bri.santeS2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.*;

@Repository
public interface EtablissementRepository extends JpaRepository<Etablissement, Long>{
	
	@Query("SELECT e FROM Etablissement e WHERE e.id = :idEtablissement")
	public Etablissement getById(@Param("idEtablissement") long idEtablissement);
	
	@Query("Select e from Etablissement e WHERE e.gouvernorat.id= :idGouvernorat")
    public List<Etablissement> getEtablissementByGouvernorat(@Param("idGouvernorat") long idGouvernorat);

    @Query("Select e from Etablissement e WHERE e.delegation.id= :idDelegation")
    public List<Etablissement> getEtablissementByDelegation(@Param("idDelegation") long idDelegation);

    @Query("Select e from Etablissement e WHERE ((e.gouvernorat.id= :idGouvernorat) and (e.secteur= :secteur))")
    public List<Etablissement> getEtablissementByGouvernoratAndSecteur(@Param("idGouvernorat") long idGouvernorat,@Param("secteur") Secteur secteur);

}
