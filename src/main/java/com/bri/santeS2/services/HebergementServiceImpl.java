package com.bri.santeS2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.dao.HebergementRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Hebergement;

@CrossOrigin(origins = "*")
@RestController
public class HebergementServiceImpl implements HebergementService{
	@Autowired
    private HebergementRepository hebergementRepository;
	@Autowired
    private DocumentRepository documentRepository;


	@Override
    @PostMapping("/addHebergement/{idDocument}")
    public long addHebergement(Hebergement hebergement, long idDocument){
        Document document = documentRepository.getById(idDocument);
        hebergement.setDocument(document);
        System.out.println("In addHebergementByDoc");
        hebergementRepository.save(hebergement);
        System.out.println("out of addHebergementByDoc");
        return hebergement.getId();
    }

	@Override
    @PutMapping("/updateHebergement")
    public void updateHebergement(Hebergement hebergement){
		System.out.println("In updateHebergement");
        hebergementRepository.save(hebergement);
        System.out.println("out of updateHebergement");
    }

	@Override
    @GetMapping("/getHebergement/{idDocument}")
    @ResponseBody
    public Hebergement getHebergement(@PathVariable("idDocument") long idDocument){
		System.out.println("In getHebergementByDoc");
        return hebergementRepository.getHebergement(idDocument);
    }

    @DeleteMapping("/deleteHebergement/{idHebergement}")
    public void deleteHebergement(@PathVariable("idHebergement") long idHebergement){
    	System.out.println("In deleteHebergement");
        hebergementRepository.deleteById(idHebergement);
        System.out.println("out of deleteHebergement");
    }

}
