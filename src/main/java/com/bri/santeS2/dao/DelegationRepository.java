package com.bri.santeS2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Delegation;

@Repository
public interface DelegationRepository extends JpaRepository<Delegation, Long>{
	@Query("SELECT d FROM Delegation d WHERE d.id = idDelegation")
	public Delegation getById(@Param("idDelegation") long idDelegation);
	
	@Query("select d from Delegation d where d.gouvernorat.id = :idGouvernorat")
    public List<Delegation> getAllDelegationByIdGouvernorat(@Param("idGouvernorat") long idGouvernorat);

    @Query("select count(*) from Delegation d where d.libelle =:libelle")
    public long checkAvailableDelegation(@Param("libelle") String libelle);

    @Query("select d from Delegation d where d.gouvernorat.libelle = :nomGouvernorat")
    public List<Delegation> getAllDelegationsByNameGov(@Param("nomGouvernorat") String nomGouvernorat);
    
    @Query("select d from Delegation d where d.gouvernorat.id = :idGouvernorat")
    public List<Delegation> getAllDelegationsByGov(@Param("idGouvernorat") long idGouvernorat);

}
