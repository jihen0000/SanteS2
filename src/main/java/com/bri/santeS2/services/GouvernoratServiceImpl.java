package com.bri.santeS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.GouvernoratRepository;
import com.bri.santeS2.entities.Gouvernorat;

@CrossOrigin(origins = "*")
@RestController
public class GouvernoratServiceImpl implements GouvernoratService{
	
	@Autowired
	private GouvernoratRepository gouvernoratRepository;
	
	@Override
	@GetMapping("/getAllGouvernorat")
	@ResponseBody
	public List<Gouvernorat> getAllGouvernorat() {

		return gouvernoratRepository.findAll();
	}
	

	
	@Override
	@PostMapping(path = "/addGov")
	@ResponseBody
	public Gouvernorat addGouvernorat(Gouvernorat gouvernorat) {
		
		return gouvernoratRepository.save(gouvernorat);
	}
	
	@Override
	public boolean checkAvailableGouvernorat(String libille) {
		
		long x = gouvernoratRepository.checkAvailableGouvernorat(libille);
		
		if (x == 0) {
			return false;
		}
		return true;
	}
	
	@Override
	@DeleteMapping("/deleteGov/{idGouvernorat}")
	public void deleteGouvernorat(@PathVariable("idGouvernorat") long idGouvernorat) {
		
		gouvernoratRepository.deleteById(idGouvernorat);
	}
	
	@Override
	@PutMapping("/updateGov")
	public void updateGouvernorat(Gouvernorat gouvernorat) {
		gouvernoratRepository.save(gouvernorat);
		
	}

}
