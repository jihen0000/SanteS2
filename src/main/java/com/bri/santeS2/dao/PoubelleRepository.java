package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Poubelle;

@Repository
public interface PoubelleRepository extends JpaRepository<Poubelle, Long>{
	@Query("select p from Poubelle p where p.document.id = :idDocument")
    public Poubelle getPoubelle(@Param("idDocument") long idDocument);

}
