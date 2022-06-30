package com.bri.santeS2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.CuisineResidantRepository;
import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.entities.CuisineResidant;
import com.bri.santeS2.entities.Document;

@CrossOrigin(origins = "*")
@RestController
public class CuisineResidantServiceImpl implements CuisineResidantService{
	@Autowired
    private CuisineResidantRepository cuisineResidantRepository;
	@Autowired
    private DocumentRepository documentRepository;
	
	@Override
	@ResponseBody
	@PostMapping(path = "/addCuisineResidant/{idDocument}")
    public long addCuisineResidant(@RequestBody CuisineResidant cuisineResidant, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        cuisineResidant.setDocument(document);
        System.out.println("In addCarr");
        cuisineResidantRepository.save(cuisineResidant);
        System.out.println("out of addCarr : ");
        return cuisineResidant.getId();
    }

	@Override
    @PutMapping("/updateCuisineResidant")
	@ResponseBody
    public void updateCuisineResidant(@RequestBody CuisineResidant cuisineResidant){
		System.out.println("In UpdateCuisineRes : ");
        cuisineResidantRepository.save(cuisineResidant);
        System.out.println("out of updateCuisineRes : ");
    }

	@Override
    @GetMapping("/getCuisineResidant/{idDocument}")
    @ResponseBody
    public CuisineResidant getCuisineResidant(@PathVariable("idDocument") long idDocument){
		System.out.println("In findCuisineRes : ");
        return cuisineResidantRepository.getCuisineResidantByIdDocument(idDocument);
    }

    @DeleteMapping("/deleteCuisineResidant/{idCuisineResidant}")
    @ResponseBody
    public void deleteCuisineResidant(@PathVariable("idCuisineResidant") long idCuisineResidant){
    	System.out.println("In deleteCuisineRes : ");
        cuisineResidantRepository.deleteById(idCuisineResidant);
        System.out.println("out of deleteCuisineRes : ");
    }

}
