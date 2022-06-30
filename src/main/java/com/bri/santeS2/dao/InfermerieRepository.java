package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Infermerie;

@Repository
public interface InfermerieRepository extends JpaRepository<Infermerie, Long>{
	@Query("select e from Infermerie e where e.document.id = :idDocument")
    public Infermerie getInfermerieByDocument(@Param("idDocument") long idDocument);

}
