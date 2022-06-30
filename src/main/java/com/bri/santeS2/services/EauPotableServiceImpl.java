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
import com.bri.santeS2.dao.EauPotableRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.EauPotable;

@CrossOrigin(origins = "*")
@RestController
public class EauPotableServiceImpl implements EauPotableService{
	
	@Autowired
    private EauPotableRepository eauPotableRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addEauPotable/{idDocument}")
	@ResponseBody
    public long addEauPotable(EauPotable eauPotable, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        eauPotable.setDocument(document);
        System.out.println("In addEauPot");
        eauPotableRepository.save(eauPotable);
        System.out.println("out of addEauPot");
        return eauPotable.getId();
    }
	
	

	@Override
    @PutMapping("/updateEauPotable")
	@ResponseBody
    public void updateEauPotable(EauPotable eauPotable){
		System.out.println("In updateEauPot");
        eauPotableRepository.save(eauPotable);
        System.out.println("out of updateEauPot");
    }

	@Override
    @GetMapping("/getEauPotable/{idDocument}")
    @ResponseBody
    public EauPotable getEauPotable(@PathVariable("idDocument") long idDocument){
		System.out.println("In getEauPotByDoc");
        return eauPotableRepository.getEauPotableByIdDocument(idDocument);
    }

    @DeleteMapping("/deleteEauPotable/{idEauPotable}")
    @ResponseBody
    public void deleteEauPotable(@PathVariable("idEauPotable") long idEauPotable){
    	System.out.println("In deleteEauPot");
        eauPotableRepository.deleteById(idEauPotable);
        System.out.println("out of deleteEauPot");
    }

}
