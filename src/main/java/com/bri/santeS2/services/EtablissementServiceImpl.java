package com.bri.santeS2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bri.santeS2.dao.DelegationRepository;
import com.bri.santeS2.dao.EtablissementRepository;
import com.bri.santeS2.dao.GouvernoratRepository;
import com.bri.santeS2.entities.Delegation;
import com.bri.santeS2.entities.Etablissement;
import com.bri.santeS2.entities.Gouvernorat;
import com.bri.santeS2.entities.Secteur;

@CrossOrigin(origins = "*")
@RestController
public class EtablissementServiceImpl implements EtablissementService{
	@Autowired
    private EtablissementRepository etablissementRepository;
	@Autowired
    private GouvernoratRepository gouvernoratRepository;
	@Autowired
    private DelegationRepository delegationRepository;

	@Override
    @PostMapping("/addEtablissement/{idGouvernorat}/{idDelegation}")
	@ResponseBody
    public long addEtablissement(Etablissement etablissement, @PathVariable("idGouvernorat") long idGouvernorat, @PathVariable("idDelegation") long idDelegation) {
        Gouvernorat gouvernorat = gouvernoratRepository.getById(idGouvernorat);
        Delegation delegation = delegationRepository.getById(idDelegation);
        etablissement.setGouvernorat(gouvernorat);
        etablissement.setDelegation(delegation);
        System.out.println("In addEtablissementByDelGov");
        etablissementRepository.save(etablissement);
        System.out.println("out of addEtablissementByDelGov");
        return etablissement.getId();
    }

	@Override
    @PutMapping("/updateEtablissement")
    public void updateEtablissement(Etablissement etablissement) {
		System.out.println("In updateEtablissement");
        etablissementRepository.save(etablissement);
        System.out.println("out of updateEtablissement");
    }

	@Override
    @DeleteMapping("/deleteEtablissement/{id}")
    public void deleteEtablissement(@PathVariable("id") long id) {
		System.out.println("In deleteEtablissement");
        etablissementRepository.deleteById(id);
        System.out.println("out of deleteEtablissement");
    }

	@Override
    @GetMapping("/getEtablissement/{id}")
    @ResponseBody
    public Etablissement getEtablissement(@PathVariable("id") long id) {
		System.out.println("In getEtablissement");
        return etablissementRepository.getById(id);
    }

	@Override
    @GetMapping("/listEtablissementByGouvernorat/{idGouvernorat}")
    @ResponseBody
    public List<Etablissement> getEtablissementByGouvernorat(@PathVariable("idGouvernorat") long idGouvernorat){
		System.out.println("In getEtablissementByGov");
        return etablissementRepository.getEtablissementByGouvernorat(idGouvernorat);
    }

	@Override
    @GetMapping("/listEtablissementByDelegation/{idDelegation}")
    @ResponseBody
    public List<Etablissement> getEtablissementByDelegation(@PathVariable("idDelegation") long idDelegation){
		System.out.println("In getEtablissementByDel");
        return etablissementRepository.getEtablissementByDelegation(idDelegation);
    }

	@Override
    @GetMapping("/getAllEtablissement")
    @ResponseBody
    public List<Etablissement> getAllEtablissement(){
		System.out.println("In getAllEtablissements");
        return etablissementRepository.findAll();
    }

	@Override
    @GetMapping("/getEtablissementByGouvernoratSecteur/{idGouvernorat}")
    @ResponseBody
    public List<Etablissement> getEtablissementByGouvernoratSecteur(@PathVariable("idGouvernorat") long idGouvernorat, Secteur secteur){
		System.out.println("In getEtablissementByGovSect");
		return etablissementRepository.getEtablissementByGouvernoratAndSecteur(idGouvernorat, secteur);
    }

}
