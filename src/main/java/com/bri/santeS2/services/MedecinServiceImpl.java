package com.bri.santeS2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.dao.MedecinRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Medecin;

@CrossOrigin(origins = "*")
@RestController
public class MedecinServiceImpl implements MedecinService{
	@Autowired
    private MedecinRepository medecinRepository;
	@Autowired
    private DocumentRepository documentRepository;


	@Override
    @PostMapping("/addMedecin/{idDocument}")
    public long addMedecin(Medecin medecin,@PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        medecin.setDocument(document);
        System.out.println("In addMedecinByDoc");
        medecinRepository.save(medecin);
        System.out.println("out of addMedecinByDoc");
        return medecin.getId();

    }

	@Override
    @PutMapping("/updateMedecin")
    public void updateMedecin(Medecin medecin){
		System.out.println("In addMedecinByDoc");
        medecinRepository.save(medecin);
    }

	@Override
    @GetMapping("/getMedecin/{idDocument}")
    @ResponseBody
    public Medecin getMedecin(@PathVariable("idDocument") long idDocument){
        return medecinRepository.getMedecinByDocument(idDocument);
    }

}
