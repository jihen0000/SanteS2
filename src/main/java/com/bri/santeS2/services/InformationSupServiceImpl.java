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
import com.bri.santeS2.dao.InformationSupRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.InformationSup;

@CrossOrigin(origins = "*")
@RestController
public class InformationSupServiceImpl implements InformationSupService{
	@Autowired
    private InformationSupRepository informationSupRepository;
	@Autowired
    private DocumentRepository documentRepository;


	@Override
    @PostMapping("/addInfoSup/{idDocument}")
    public long addInformationSup(InformationSup informationSup, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        informationSup.setDocument(document);
        System.out.println("In addInfoSupByDoc");
        informationSupRepository.save(informationSup);
        System.out.println("out of addInfoSupByDoc");
        return informationSup.getId();
    }

	@Override
    @PutMapping("/updateInfoSup")
    public void updateInformationSup(InformationSup informationSup){
		System.out.println("In updateInfoSup");
        informationSupRepository.save(informationSup);
        System.out.println("out of updateInfoSup");
    }

	@Override
    @GetMapping("/getInfoSup/{idDocument}")
    @ResponseBody
    public InformationSup getInformationSup(@PathVariable("idDocument") long idDocument){
		System.out.println("In getInfoSupByDoc");
        return informationSupRepository.getInformatioSupByDocument(idDocument);
    }

}
