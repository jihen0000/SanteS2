package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.ElementSante;
import com.bri.santeS2.entities.Lavabos;
import com.bri.santeS2.entities.Robinets;
import com.bri.santeS2.entities.Toilettes;
import com.bri.santeS2.entities.Urinoirs;

@Repository
public interface ElementSanteRepository extends JpaRepository<ElementSante, Long>{
	@Query("select r from Robinets r where r.document.id = :idDocument")
    public Robinets getRobinetsByIdDocuments(@Param("idDocument") long idDocument);
	
	@Query("select u from Urinoirs u where u.document.id = :idDocument")
    public Urinoirs getUrinoirsByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select t from Toilettes t where t.document.id = :idDocument")
    public Toilettes getToilettesByIdDocument(@Param("idDocument") long idDocument);
	
	@Query("select l from Lavabos l where l.document.id = :idDocument")
    public Lavabos getLavabosByIDocument(@Param("idDocument") long idDocument);

}
