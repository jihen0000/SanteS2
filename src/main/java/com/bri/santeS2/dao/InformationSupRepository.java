package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.InformationSup;

@Repository
public interface InformationSupRepository extends JpaRepository<InformationSup, Long>{
	@Query("select i from InformationSup i where i.document.id = :idDocument")
    public InformationSup getInformatioSupByDocument(@Param("idDocument") long idDocument);

}
