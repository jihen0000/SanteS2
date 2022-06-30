package com.bri.santeS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DocumentRepository;
import com.bri.santeS2.dao.EtablissementRepository;
import com.bri.santeS2.entities.Document;
import com.bri.santeS2.entities.Etablissement;
import com.bri.santeS2.entities.Secteur;
import com.bri.santeS2.entities.TypeVisite;

@CrossOrigin(origins = "*")
@RestController
public class DocumentServiceImpl implements DocumentService{
	@Autowired
    private DocumentRepository documentRepository;
	@Autowired
    private EtablissementRepository etablissementRepository;
	
	@Override
	@PostMapping("/addDocument/{idEtablissement}")
    public long addDocument(@RequestBody Document document,@PathVariable("idEtablissement") long idEtablissement){
        Etablissement etablissement = etablissementRepository.getById(idEtablissement);
        document.setEtablissement(etablissement);
        System.out.println("In addDoc");
        documentRepository.save(document);
        System.out.println("out of addDoc");
        return document.getId();
    }

	@Override
    @PutMapping("/updateDocument")
    public void updateDocument(@RequestBody Document document){

		System.out.println("In updateDoc");
        documentRepository.save(document);
        System.out.println("out of updateDoc");
    }

	@Override
    @GetMapping("/getDocument/{idDocument}")
    @ResponseBody
    public Document getDocument(@PathVariable("idDocument") long idDocument){
		System.out.println("In getDoc");
        return documentRepository.getById(idDocument);
    }

	@Override
    @DeleteMapping("/deleteDocument/{idDocument}")
    public void deleteDocument(@PathVariable("idDocument") long idDocument){
		System.out.println("In deleteDoc");
        documentRepository.deleteById(idDocument);
        System.out.println("out of deleteDoc");

    }

	@Override
    @GetMapping("/getDocumentsByIdEtablissement/{idEtablissement")
    @ResponseBody
    public List<Document> getDocumentsByEtablissemnt(@PathVariable("idEtablissement") long idEtablissement){
    	System.out.println("In getDocByEtab");
        return documentRepository.getDocumentsByIdEtablissement(idEtablissement);
    }

    @Override
    @GetMapping("/getDocumentsByAnnee/{annee}")
    @ResponseBody
    public List<Document> getDocumentsByAnnee(@PathVariable("annee") String annee){
    	System.out.println("In getDocByAnn");
        return documentRepository.getDocumentsByAnnee(annee);
    }

    @Override
    @GetMapping("/getDocuments/{idEtablissement}/{annee}")
    @ResponseBody
    public List<Document> getDocuments(@PathVariable("idEtablissement") long idEtablissement, @PathVariable("annee") String annee){
    	System.out.println("In getDocByEtabAnn");
        return documentRepository.getDocumentByIdEtablissementAndAnnee(idEtablissement, annee);
    }

   @Override
    @GetMapping("/getListAnneByIdEtablissement/{idEtablissement")
    @ResponseBody
    public List<String> getListAnnee(@PathVariable("idEtablissement") long idEtablissement){
    	System.out.println("In getAnnByEtab");
        return documentRepository.getListAnneeByIdEtablissement(idEtablissement);
    }


    @Override
    @GetMapping("/getDocumentsByGov/{idGouvernorat}")
    @ResponseBody
    public List<Document> getDocumentsByGov(@PathVariable("idGouvernorat") long idGouvernorat){
    	System.out.println("In getDocByGov");
        return documentRepository.getDocumentsByGov(idGouvernorat);
    }

    @Override
    @GetMapping("/getDocumentsByDelegation/{idDelegation}")
    @ResponseBody
    public List<Document> getDocumentsByDelegation(@PathVariable("idDelegation") long idDelegation){
    	System.out.println("In getDocByDele");
        return documentRepository.getDocumentsByDelegation(idDelegation);
    }

    @Override
    @GetMapping("/getDocumentAnneeTypeVisite/{idEtablissement}/{annee}/{typeVisite}")
    @ResponseBody
    public Document getDocumentAnneeTypeVisite(@PathVariable("idEtablissement") long idEtablissement, @PathVariable("annee") String annee, @PathVariable("typeVisite") TypeVisite typeVisite){
    	System.out.println("In getDocByAnnTypeVisite");
        return documentRepository.getDocumentAnneeTypeVisite(idEtablissement,annee,typeVisite);
    }

    @Override
    @GetMapping("/getAnneesByGouvernorat/{idGouvernorat}")
    @ResponseBody
    public List<String> getAnneesByGouvernorat(@PathVariable("idGouvernorat") long idGouvernorat){
    	System.out.println("In getAnnByGov");
        return documentRepository.getAnneesByGouvernorat(idGouvernorat);
    }

    @Override
    @GetMapping("/getListDocumentAnneeTypeVisiteSecteur/{annee}/{typeVisite}/{secteur}/{idGouvernorat}")
    @ResponseBody
    public List<Document> getListDocumentAnneeTypeVisiteSecteur(@PathVariable("annee") String annee, @PathVariable("typeVisite") TypeVisite typeVisite, @PathVariable("secteur") Secteur secteur, @PathVariable("idGouvernorat") long idGouvernorat){
    	System.out.println("In getDocByAnnTypeVisiteSecteur");
    	return documentRepository.getListDocumentAnneeTypeVisiteSecteur(annee,typeVisite,secteur,idGouvernorat);
    }

    @Override
    @GetMapping("getAnneesByGouvernoratVisiteSecteur/{idGouvernorat}/{typeVisite}/{secteur}")
    @ResponseBody
    public List<String> getAnneesByGouvernoratVisiteSecteur(@PathVariable("idGouvernorat") long idGouvernourat, @PathVariable("typeVisite") TypeVisite typeVisite, @PathVariable("secteur") Secteur secteur){
    	System.out.println("In getAnnByGovTypeVisiteSecteur");
    	return documentRepository.getAnneesByGouvernoratVisiteSecteur(idGouvernourat,typeVisite,secteur);
    }

    
    @GetMapping("/docissam/{idGouvernorat}/{typeVisite}/{secteur}")
    @ResponseBody
    public List<Document> docissam(@PathVariable("idGouvernorat") long idGouvernorat, @PathVariable("typeVisite") TypeVisite typeVisite, @PathVariable("secteur") Secteur secteur){
    	System.out.println("In docissam");
    	return documentRepository.docissam(idGouvernorat,typeVisite,secteur);
    }

	
}
