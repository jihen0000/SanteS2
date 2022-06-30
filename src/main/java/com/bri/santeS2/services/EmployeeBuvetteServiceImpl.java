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

import com.bri.santeS2.dao.BuvetteRepository;
import com.bri.santeS2.dao.EmployeeBuvetteRepository;
import com.bri.santeS2.entities.Buvette;
import com.bri.santeS2.entities.EmployeeBuvette;

@CrossOrigin(origins = "*")
@RestController
public class EmployeeBuvetteServiceImpl implements EmployeeBuvetteService{
	@Autowired
    private EmployeeBuvetteRepository employeeBuvetteRepository;
	@Autowired
    private BuvetteRepository buvetteRepository;

	@Override
    @PostMapping("/addEmployeeBuvette/{idBuvette}")
	@ResponseBody
    public long addEmployeeBuvette(EmployeeBuvette employeeBuvette, @PathVariable("idBuvette") long idBuvette){
        Buvette buvette = buvetteRepository.getById(idBuvette);
        employeeBuvette.setBuvette(buvette);
        System.out.println("In addEmplBuvetteByIdBuv");
        employeeBuvetteRepository.save(employeeBuvette);
        System.out.println("out of addEmplBuvetteByIdBuv");
        return employeeBuvette.getId();
    }

	@Override
    @PutMapping("/updateEmployeeBuvette")
    public void updateEmployeeBuvette(EmployeeBuvette employeeBuvette){
		System.out.println("In updateEmplBuvette");
        employeeBuvetteRepository.save(employeeBuvette);
        System.out.println("out of updateEmplBuvette");
    }

	@Override
    @GetMapping("/getEmployeeBuvette/{idBuvette}")
    @ResponseBody
    public EmployeeBuvette getEmployeeBuvette(@PathVariable("idBuvette") long idBuvette){
		System.out.println("In getEmplBuvetteByIdBuv");
        return employeeBuvetteRepository.getEmployeeBuvetteByIdBuvette(idBuvette);
    }

    @DeleteMapping("/deleteEmployeeBuvette/{idEmployeeBuvette}")
    public void deleteEmployeeBuvette(@PathVariable("idEmployeeBuvette") long idEmployeeBuvette){
    	System.out.println("In deleteEmplBuvette");
        employeeBuvetteRepository.deleteById(idEmployeeBuvette);
        System.out.println("out of deleteEmplBuvette");
    }
	

}
