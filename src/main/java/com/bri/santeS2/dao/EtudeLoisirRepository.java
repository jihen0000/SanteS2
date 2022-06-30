package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.EtudeLoisir;

@Repository
public interface EtudeLoisirRepository extends JpaRepository<EtudeLoisir, Long>{
	@Query("select e from EtudeLoisir e where e.document.id = :idDocument")
    public EtudeLoisir getEtudeLoisirByDocument(@Param("idDocument") long idDocument);

}
