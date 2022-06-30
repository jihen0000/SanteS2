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
import com.bri.santeS2.dao.InfermerieRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Infermerie;

@CrossOrigin(origins = "*")
@RestController
public class InfermerieServiceImpl implements InfermerieService{
	@Autowired
    private InfermerieRepository infermerieRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addInfermerie/{idDocument}")
    public long addInfermerie(Infermerie infermerie,@PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        infermerie.setDocument(document);
        System.out.println("In addInfermerieByDoc");
        infermerieRepository.save(infermerie);
        System.out.println("out of addInfermerieByDoc");
        return infermerie.getId();
    }

	@Override
    @PutMapping("/updateInfermerie")
    public void updateInfermerie(Infermerie infermerie){
		System.out.println("In updateInfermerie");
        infermerieRepository.save(infermerie);
        System.out.println("out of updateInfermerie");
    }

	@Override
    @GetMapping("/getInfermerie/{idDocument}")
    @ResponseBody
    public Infermerie getInfermerie(@PathVariable("idDocument") long idDocument){
		System.out.println("In getInfermerieByDoc");
        return infermerieRepository.getInfermerieByDocument(idDocument);
    }

    @DeleteMapping("/deleteInfermerie/{idInfermerie}")
    public void deleteInfermerie(@PathVariable("idInfermerie") long idInfermerie){
    	System.out.println("In deleteInfermerie");
        infermerieRepository.deleteById(idInfermerie);
        System.out.println("out of deleteInfermerie");
    }

}
