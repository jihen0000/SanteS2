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
import com.bri.santeS2.dao.PoubelleRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Poubelle;

@CrossOrigin(origins = "*")
@RestController
public class PoubelleServiceImpl implements PoubelleService{
	@Autowired
    private PoubelleRepository poubelleRepository;
	@Autowired
    private DocumentRepository documentRepository;


	@Override
    @PostMapping("/addPoubelle/{idDocument}")
    public long addPoubelle(Poubelle poubelle, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        poubelle.setDocument(document);
        poubelleRepository.save(poubelle);
        return poubelle.getId();
    }

	@Override
    @PutMapping("/updatePoubelle")
    public void updatePoubelle(Poubelle poubelle){
        poubelleRepository.save(poubelle);
    }

	@Override
    @GetMapping("/getPoubelle/{idDocument}")
    @ResponseBody
    public Poubelle getPoubelle(@PathVariable("idDocument") long idDocument){
        return poubelleRepository.getPoubelle(idDocument);
    }

    @DeleteMapping("/deletePoubelle/{idPoubelle}")
    public void deletePoubelle(@PathVariable("idPoubelle") long idPoubelle){
        poubelleRepository.deleteById(idPoubelle);
    }

}
