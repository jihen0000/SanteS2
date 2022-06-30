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

import com.bri.santeS2.dao.DelegationRepository;
import com.bri.santeS2.dao.GouvernoratRepository;
import com.bri.santeS2.entities.Delegation;
import com.bri.santeS2.entities.Gouvernorat;

@CrossOrigin(origins = "*")
@RestController
public class DelegationServiceImpl implements DelegationService{
	
	@Autowired
	private DelegationRepository delegationRepository;
	@Autowired
	private GouvernoratRepository gouvernoratRepository;
	
	@Override
	@GetMapping("/getAllDelegationsByGov/{idGouvernorat}")
	@ResponseBody
	public List<Delegation> getAllDelegations(@PathVariable("idGouvernorat") long idGouvernorat) {
		return delegationRepository.getAllDelegationsByGov(idGouvernorat);
	}
	
	@Override
	public boolean checkAvailableDelegation(String libille) {
		
		long x= delegationRepository.checkAvailableDelegation(libille);
		if (x == 0) {
			return false;
		}
		return true;
	}
	
	@Override
	@PostMapping(path= "/addDelegation")
	public long addDelegation(Delegation delegation, long idGouvernorat) {
		
		Gouvernorat gouvernorat = gouvernoratRepository.getById(idGouvernorat);
		delegation.setGouvernorat(gouvernorat);
		delegationRepository.save(delegation);
		return delegation.getId();
	}
	
	@Override
	@DeleteMapping("/deleteDelegation/{idDelegation}")
	public void deleteDelegation(@PathVariable("idDelegation") long idDelegation) {
		delegationRepository.deleteById(idDelegation);;
		
	}
	
	@Override
	@PutMapping("/updateDelegation")
	public void updateDelegation(Delegation delegation) {
		delegationRepository.save(delegation);
		
	}
	
	@Override
	@GetMapping("/getAllDelegationsBGovName/{nomGouvernorat}")
	@ResponseBody
	public List<Delegation> getAllDelegationsByName(@PathVariable("nomGouvernorat") String nomGouvernorat) {
		return delegationRepository.getAllDelegationsByNameGov(nomGouvernorat);
	}

}
