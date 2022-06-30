package com.bri.santeS2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bri.santeS2.entities.Parametres;

@Repository
public interface ParametresRepository extends JpaRepository<Parametres, Long>{

}
