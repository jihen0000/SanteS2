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
import com.bri.santeS2.dao.InformationGeneraleRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.InformationGenerale;

@CrossOrigin(origins = "*")
@RestController
public class InformationGeneraleServiceImpl implements InformationGeneraleService{
	@Autowired
    private InformationGeneraleRepository informationGeneraleRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addInfoGenerale/{idDocument}")
    public long addInfoGenerale(InformationGenerale informationGenerale, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        informationGenerale.setDocument(document);
        System.out.println("In addInfoGenByDoc");
        informationGeneraleRepository.save(informationGenerale);
        System.out.println("out of addInfoGenByDoc");
        return informationGenerale.getId();
    }

	@Override
    @PutMapping("/updateInfoGen")
    public void updateInfoGenerale(InformationGenerale informationGenerale){
		System.out.println("In updateInfoGen");
        informationGeneraleRepository.save(informationGenerale);
        System.out.println("out of updateInfoGen");
    }

	@Override
    @GetMapping("/getInfoGenerale/{idDocument}")
    @ResponseBody
    public InformationGenerale getInfoGenerale(@PathVariable("idDocument") long idDocument){
		System.out.println("In getInfoGenByDoc");
        return informationGeneraleRepository.getInformationGeneraleByDocument(idDocument);
    }

    @DeleteMapping("/deleteInfoGenerale/{idInfoGenerale}")
    public void deleteInfoGenerale(@PathVariable("idInfoGenerale") long idInfoGenerale){
    	System.out.println("In deleteInfoGen");
        informationGeneraleRepository.deleteById(idInfoGenerale);
        System.out.println("out of deleteInfoGen");
    }
	

}
