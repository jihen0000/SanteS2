package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Hebergement;

@Repository
public interface HebergementRepository extends JpaRepository<Hebergement, Long>{
	@Query("select h from Hebergement h where h.document.id = :idDocument")
    public Hebergement getHebergement(@Param("idDocument") long idDocument);

}
