package com.bri.santeS2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.dao.InfermierRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Infermier;

@CrossOrigin(origins = "*")
@RestController
public class InfermierServiceImpl implements InfermierService{
	@Autowired
    private InfermierRepository infermierRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addInfermier/{idDocument}")
    public long addInfermier(Infermier infermier, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        infermier.setDocument(document);
        System.out.println("In addInfermierByDoc");
        infermierRepository.save(infermier);
        System.out.println("out of addInfermierByDoc");
        return infermier.getId();
    }
	
	@Override
    @PutMapping("/updateInfermier")
    public void updateInfermier(Infermier infermier){
		System.out.println("In updateInfermier");
        infermierRepository.save(infermier);
        System.out.println("out of updateInfermier");
     }

	@Override
    @GetMapping("/getInfermier/{idDocument}")
    public Infermier getInfermier(@PathVariable("idDocument") long idDocument){
		System.out.println("In getInfermierByDoc");
        return infermierRepository.getInfermierByDocument(idDocument);
     }
	

}
