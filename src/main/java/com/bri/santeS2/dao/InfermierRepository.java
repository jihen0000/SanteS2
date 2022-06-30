package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Infermier;

@Repository
public interface InfermierRepository extends JpaRepository<Infermier, Long>{
	@Query("select i from Infermier i where i.document.id = :idDocument")
    public Infermier getInfermierByDocument(@Param("idDocument") long idDocument);

}
