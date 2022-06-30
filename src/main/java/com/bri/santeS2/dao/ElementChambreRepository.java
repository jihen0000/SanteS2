package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Bureau;
import com.bri.santeS2.entities.Chaises;
import com.bri.santeS2.entities.Draps;
import com.bri.santeS2.entities.ElementChambre;
import com.bri.santeS2.entities.Matelas;
import com.bri.santeS2.entities.Rangements;

@Repository
public interface ElementChambreRepository extends JpaRepository<ElementChambre, Long>{
	
	@Query("select b from Bureau b where b.document.id = :idDocument")
    public Bureau getBureauByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select c from Chaises c where c.document.id = :idDocument")
    public Chaises getChaiseByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select d from Draps d where d.document.id = :idDocument")
    public Draps getDrapsByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select m from Matelas m where m.document.id = :idDocument")
    public Matelas getMatelasByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select r from Rangements r where r.document.id = :idDocument")
    public Rangements getRangementsByIdDocuments(@Param("idDocument") long idDocument);

}
