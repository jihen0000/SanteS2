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
import com.bri.santeS2.dao.ElementSanteRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.ElementSante;
import com.bri.santeS2.entities.Lavabos;
import com.bri.santeS2.entities.Robinets;
import com.bri.santeS2.entities.Toilettes;
import com.bri.santeS2.entities.Urinoirs;

@CrossOrigin(origins = "*")
@RestController
public class ElementSanteServiceImpl implements ElementSanteService{
	@Autowired
    private ElementSanteRepository elementSanteRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addElementSante/{idDocument}")
	@ResponseBody
    public long addElementSante(ElementSante elementSante, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        elementSante.setDocument(document);
        System.out.println("In addElmtSante");
        elementSanteRepository.save(elementSante);
        System.out.println("out of addElmtSante");
        return elementSante.getId();
    }

	@Override
    @PutMapping("/updateElementSante")
    public void updateElementSante(ElementSante elementSante){
		System.out.println("In updateElmtSante");
        elementSanteRepository.save(elementSante);
        System.out.println("out of updateElmtSante");
    }

	@Override
    @GetMapping("/getRobinet/{idDocument}")
    @ResponseBody
    public Robinets getRoubinets(@PathVariable("idDocument") long idDocument){
		System.out.println("In getRobinetByDoc");
        return elementSanteRepository.getRobinetsByIdDocuments(idDocument);
    }

	@Override
    @GetMapping("/getUrinoirs/{idDocument}")
    @ResponseBody
    public Urinoirs getUrinoirs(@PathVariable("idDocument") long idDocument){
		System.out.println("In getUrinoirByDoc");
        return elementSanteRepository.getUrinoirsByIdDocument(idDocument);
    }

	@Override
    @GetMapping("/getToilette/{idDocument}")
    @ResponseBody
    public Toilettes getToilettes(@PathVariable("idDocument") long idDocument){
		System.out.println("In getToiletteByDoc");
        return elementSanteRepository.getToilettesByIdDocument(idDocument);
    }

	@Override
    @GetMapping("/getLavabo/{idDocument}")
    @ResponseBody
    public Lavabos getLavabos(@PathVariable("idDocument") long idDocument){
		System.out.println("In getLavaboByDoc");
        return elementSanteRepository.getLavabosByIDocument(idDocument);
    }

}
