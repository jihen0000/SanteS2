package com.bri.santeS2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Gouvernorat;

@Repository
public interface GouvernoratRepository extends JpaRepository<Gouvernorat, Long>{
	@Query("Select g From Gouvernorat g Where g.id = idGouvernorat")
	public Gouvernorat getById(@Param("idGouvernorat") long idGouvernorat);
	
	
	@Query("select count(*) from Gouvernorat g where g.libelle =:libelle")
	public long checkAvailableGouvernorat(@Param("libelle") String libille);

}
