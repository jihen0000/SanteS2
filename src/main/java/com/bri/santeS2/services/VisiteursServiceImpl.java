package com.bri.santeS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.dao.VisiteurRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Visiteur;

@CrossOrigin(origins = "*")
@RestController
public class VisiteursServiceImpl implements VisiteursService{
	@Autowired
    private VisiteurRepository visiteurRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addVisiteur/{idDocument}")
    public long addVisiteur(Visiteur visiteur, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        visiteur.setDocument(document);
        visiteurRepository.save(visiteur);
        return visiteur.getId();
    }

	@Override
    @PostMapping("/addVisiteurs/{idDocument}")
    public void addVisiteurs(List<Visiteur> visiteurs, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        for (Visiteur visiteur : visiteurs){
            visiteur.setDocument(document);
            visiteurRepository.save(visiteur);
        }
    }

	@Override
    @GetMapping("/getVisiteurs/{idDcument}")
    @ResponseBody
    public List<Visiteur> getVisiteurs(@PathVariable("idDocument") long idDocument){
        return visiteurRepository.getVisiteurByDocument(idDocument);
    }

}
