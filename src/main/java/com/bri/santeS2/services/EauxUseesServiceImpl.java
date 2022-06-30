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
import com.bri.santeS2.dao.EauxUseesRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.EauxUsees;

@CrossOrigin(origins = "*")
@RestController
public class EauxUseesServiceImpl implements EauxUseesService{
	@Autowired
    private EauxUseesRepository eauxUseesRepository;
	@Autowired
    private DocumentRepository documentRepository;

	@Override
    @PostMapping("/addEauxUsees/{idDocument}")
	@ResponseBody
    public long addEauxUsees(EauxUsees eauxUsees, @PathVariable("idDocument") long idDocument){
        Document document = documentRepository.getById(idDocument);
        eauxUsees.setDocument(document);
        System.out.println("In addEauxUsee");
        eauxUseesRepository.save(eauxUsees);
        System.out.println("out of addEauxUsee");
        return eauxUsees.getId();
    }

	@Override
    @PutMapping("/updateEauxUsees")
	@ResponseBody
    public void updateEauxUsees(EauxUsees eauxUsees){
		System.out.println("In updateEauxUsee");
        eauxUseesRepository.save(eauxUsees);
        System.out.println("out of updateEauxUsee");
    }

	@Override
    @GetMapping("/getEauxUsees/{idDocument}")
    @ResponseBody
    public EauxUsees getEauxUsees(@PathVariable("idDocument") long idDocument){
		System.out.println("In getEauxUseeByDoc");
        return eauxUseesRepository.getEauxUseesByIdDocument(idDocument);
    }

    @DeleteMapping("/deleteEauxUsees/{idEauxUsees}")
    @ResponseBody
    public void deleteEauxUsees(@PathVariable("idEauxUsees") long idEauxUsees){
    	System.out.println("In deleteEauxUsee");
        eauxUseesRepository.deleteById(idEauxUsees);
        System.out.println("In deleteEauxUsee");
    }

}
