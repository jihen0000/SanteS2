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
import com.bri.santeS2.dao.ElementChambreRepository;
import com.bri.santeS2.entities.Bureau;
import com.bri.santeS2.entities.Chaises;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Draps;
import com.bri.santeS2.entities.ElementChambre;
import com.bri.santeS2.entities.Matelas;
import com.bri.santeS2.entities.Rangements;

@CrossOrigin(origins = "*")
@RestController
public class ElementChambreServiceImpl implements ElementChambreService{
	
	@Autowired
    private ElementChambreRepository elementChambreRepository;
	@Autowired
    private DocumentRepository documentRepository;


	@Override
    @PostMapping("/addElementChambre/{idDocument}")
	@ResponseBody
    public long addElementChambre(ElementChambre elementChambre, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        elementChambre.setDocument(document);
        System.out.println("In addElmtCham");
        elementChambreRepository.save(elementChambre);
        System.out.println("out of addElmtCham");
        return elementChambre.getId();
    }

	@Override
    @PutMapping("/updateElementChambre")
	@ResponseBody
    public void updateElementChambre(ElementChambre elementChambre){
		System.out.println("In updateElmtCham");
        elementChambreRepository.save(elementChambre);
        System.out.println("out of updateElmtCham");
    }


	@Override
    @GetMapping("/getMatelas/{idDocument}")
    @ResponseBody
    public Matelas getMatelas(@PathVariable("idDocument") long idDocument){
		System.out.println("In getMatelasByDoc");
        return elementChambreRepository.getMatelasByIdDocument(idDocument);
    }

	@Override
    @GetMapping("/getDraps/{idDocument}")
    @ResponseBody
    public Draps getDraps(@PathVariable("idDocument") long idDocument){
		System.out.println("In getDrapsByDoc");
        return elementChambreRepository.getDrapsByIdDocument(idDocument);
    }

	@Override
    @GetMapping("/getRangements/{idDocument}")
    @ResponseBody
    public Rangements getRangements(@PathVariable("idDocument") long idDocument){
		System.out.println("In getRangemenetsByDoc");
        return elementChambreRepository.getRangementsByIdDocuments(idDocument);
    }

	@Override
    @GetMapping("/getBureau/{idDocument}")
    @ResponseBody
    public Bureau getBureau(@PathVariable("idDocument") long idDocument){
		System.out.println("In getBureauByDoc");
        return elementChambreRepository.getBureauByIdDocument(idDocument);
    }

	@Override
    @GetMapping("/getChaise/{idDocument}")
    @ResponseBody
    public Chaises getChaise(@PathVariable("idDocument") long idDocument){
		System.out.println("In getChaiseByDoc");
        return elementChambreRepository.getChaiseByIdDocument(idDocument);
    }

}
