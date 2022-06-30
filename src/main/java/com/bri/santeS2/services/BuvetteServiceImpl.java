package com.bri.santeS2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.BuvetteRepository;
import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.entities.Buvette;
import com.bri.santeS2.entities.Document;

@CrossOrigin(origins = "*")
@RestController
public class BuvetteServiceImpl implements BuvetteService{
	@Autowired
	public BuvetteRepository buvetteRepository;
	@Autowired
	public DocumentRepository documentRepository;
	
	@Override
	@ResponseBody
	@PostMapping(path="/addBuvette/{idDocument}")
	public long addBuvette(@RequestBody Buvette buvette, @PathVariable("idDocument") long idDocument) {
		Document document = documentRepository.getById(idDocument);
        buvette.setDocument(document);
        System.out.println("In addBuv");
        buvetteRepository.save(buvette);
        System.out.println("out of addBuv");
        return buvette.getId();
	}
	
	@Override
	@PutMapping("/updateBuvette")
	@ResponseBody
	public void updateBuvette(@RequestBody Buvette buvette) {
		System.out.println("In updateBuv");
		buvetteRepository.save(buvette);
		System.out.println("Out of updateBuv : ");
	}
	
	@Override
	@GetMapping("/findBuvette/{idDocument}")
	@ResponseBody
	public Buvette getBuvette(long idDocument) {
		System.out.println("In findBuv : ");
		return buvetteRepository.getBuvetteByIdDocument(idDocument);
	}

}
