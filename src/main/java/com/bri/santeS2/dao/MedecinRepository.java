package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Medecin;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long>{
	@Query("select m from Medecin m where m.document.id = :idDocument")
    public Medecin getMedecinByDocument(@Param("idDocument") long idDocument);

}
