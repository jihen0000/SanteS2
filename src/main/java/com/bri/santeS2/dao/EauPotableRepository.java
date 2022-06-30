package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.EauPotable;

@Repository
public interface EauPotableRepository extends JpaRepository<EauPotable, Long>{
	@Query("select e from EauPotable e where e.document.id = :idDocument")
    public EauPotable getEauPotableByIdDocument(@Param("idDocument") long idDocument);

}
