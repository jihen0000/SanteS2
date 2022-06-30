package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Buvette;


@Repository
public interface BuvetteRepository extends JpaRepository<Buvette,Long>{
	@Query("SELECT b FROM Buvette b WHERE b.id = idBuvette")
	public Buvette getById(@Param("idBuvette") long idBuvette);
	
	@Query("SELECT b FROM Buvette b where b.document.id = :idDocument")
    public Buvette getBuvetteByIdDocument(@Param("idDocument") long idDocument);

}
