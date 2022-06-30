package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.InformationGenerale;

@Repository
public interface InformationGeneraleRepository extends JpaRepository<InformationGenerale, Long>{
	@Query("select i from InformationGenerale i where i.document.id = :idDocument")
    public InformationGenerale getInformationGeneraleByDocument(@Param("idDocument") long idDocument);

}
