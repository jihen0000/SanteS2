package com.bri.santeS2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Visiteur;

@Repository
public interface VisiteurRepository extends JpaRepository<Visiteur, Long>{
	@Query("select v from Visiteur v  where v.document.id = :idDocument")
    public List<Visiteur> getVisiteurByDocument(@Param("idDocument") long idDocument);

}
