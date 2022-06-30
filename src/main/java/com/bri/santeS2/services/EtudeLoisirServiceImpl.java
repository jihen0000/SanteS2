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
import com.bri.santeS2.dao.EtudeLoisirRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.EtudeLoisir;

@CrossOrigin(origins = "*")
@RestController
public class EtudeLoisirServiceImpl implements EtudeLoisirService{
	@Autowired
    private EtudeLoisirRepository etudeLoisirRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addEtudeLoisir/{idDocument}")
    public long addEtudeLoisir(EtudeLoisir etudeLoisir, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        etudeLoisir.setDocument(document);
        System.out.println("In addEtudeLoisirByDoc");
        etudeLoisirRepository.save(etudeLoisir);
        System.out.println("out of addEtudeLoisirByDoc");
        return etudeLoisir.getId();
    }

    @Override
    @PutMapping("/updateEtudeLoisir")
    public void updateEtudeLoisir(EtudeLoisir etudeLoisir){
    	System.out.println("In updateEtudeLoisir");
        etudeLoisirRepository.save(etudeLoisir);
        System.out.println("out of updateEtudeLoisir");
    }

    @Override
    @GetMapping("/getEtudeLoisir/{idDocument}")
    @ResponseBody
    public EtudeLoisir getEtudeLoisir(@PathVariable("idDocument") long idDocument){
    	System.out.println("In getEtudeLoisirByDoc");
        return etudeLoisirRepository.getEtudeLoisirByDocument(idDocument);
    }

    @DeleteMapping("/deleteEtudeLoisir/{idEtudeLoisir}")
    public void deleteEtudeLoisir(@PathVariable("idEtudeLoisir") long idEtudeLoisir){
    	System.out.println("In deleteEtudeLoisir");
        etudeLoisirRepository.deleteById(idEtudeLoisir);
        System.out.println("out of deleteEtudeLoisir");
    }

}
