package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.EtatBatiment;

@Repository
public interface EtatBatimentRepository extends JpaRepository<EtatBatiment, Long>{
	@Query("select e from EtatBatiment e where e.document.id = :idDocument")
    public EtatBatiment getEtatBatiment(@Param("idDocument") long idDocument);

}
