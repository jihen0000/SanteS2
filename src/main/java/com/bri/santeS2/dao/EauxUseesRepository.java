package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.EauxUsees;

@Repository
public interface EauxUseesRepository extends JpaRepository<EauxUsees, Long>{
	@Query("select e from EauxUsees e where e.document.id = :idDocument")
    public EauxUsees getEauxUseesByIdDocument(@Param("idDocument") long idDocument);

}
