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
import com.bri.santeS2.dao.EtatBatimentRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.EtatBatiment;

@CrossOrigin(origins = "*")
@RestController
public class EtatBatimentServiceImpl implements EtatBatimentService{
	@Autowired
    private EtatBatimentRepository etatBatimentRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addEtatBatiment/{idDocument}")
	@ResponseBody
    public long addEtatBatiment(EtatBatiment etatBatiment, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        etatBatiment.setDocument(document);
        System.out.println("In addEtatBatimentByDoc");
        etatBatimentRepository.save(etatBatiment);
        System.out.println("out of addEtatBatimentByDoc");
        return etatBatiment.getId();
    }

	@Override
    @PutMapping("/updateEtatBatiment")
    public void updateEtatBatiment(EtatBatiment etatBatiment){
		System.out.println("In updateEtatBatiment");
        etatBatimentRepository.save(etatBatiment);
        System.out.println("out of updateEtatBatiment");
    }

	@Override
    @GetMapping("/getEtatBatiment/{idDocument}")
    @ResponseBody
    public EtatBatiment getEtatBatiment(@PathVariable("idDocument") long idDocument){
		System.out.println("In getEtatBatimentByDoc");
        return etatBatimentRepository.getEtatBatiment(idDocument);
    }

    @DeleteMapping("/deleteEtatBatiment/{idEtatBatiement}")
    public void deleteEtatBatiment(@PathVariable("idEtatBatiment") long idEtatBatiment){
    	System.out.println("In deleteEtatBatiment");
        etatBatimentRepository.deleteById(idEtatBatiment);
        System.out.println("out of deleteEtatBatiment");
    }

}
