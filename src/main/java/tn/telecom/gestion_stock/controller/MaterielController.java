package tn.telecom.gestion_stock.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.telecom.gestion_stock.model.Materiel;
import tn.telecom.gestion_stock.service.MaterielService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/Materiel")
public class MaterielController {
	
	private MaterielService materielservice;

	public MaterielController(MaterielService materielservice) {
		super();
		this.materielservice=materielservice;
	}
	
	@PostMapping("/save")
	public Materiel saveMateriel (@RequestBody Materiel materiels) {
		return materielservice.saveMateriel(materiels);
	}
	
	@PutMapping("/update/{id}")
	public Materiel updateMateriel(@PathVariable Long id ,@RequestBody Materiel materiels) {
		return materielservice.updateMateriel(id,materiels);
	}
	
	@GetMapping("/")
	public List<Materiel> listeMateriel(){
		return materielservice.listemateriel();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteMateriel(@PathVariable Long id) {
		materielservice.deleteMateriel(id);
	}
	@GetMapping("/chercher/{id}")
	public Materiel findMateriel(@PathVariable Long id) {
		Materiel materiel=materielservice.FindByIdMateriel(id);
		return materiel;
	}
}	