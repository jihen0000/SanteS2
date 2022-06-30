package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.EmployeeBuvette;

@Repository
public interface EmployeeBuvetteRepository extends JpaRepository<EmployeeBuvette, Long>{
	@Query("select e from EmployeeBuvette e where e.buvette.id = :idBuvette")
    public EmployeeBuvette getEmployeeBuvetteByIdBuvette(@Param("idBuvette") long idBuvette);

}
