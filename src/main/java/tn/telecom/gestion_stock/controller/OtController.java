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

import tn.telecom.gestion_stock.model.OrdreTraveaux;
import tn.telecom.gestion_stock.service.otService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/OrodreTraveaux")
public class OtController {
	
	private otService otservice;

	public OtController(otService otservice) {
		super();
		this.otservice = otservice;
	}
	
	@PostMapping("/save")
	public OrdreTraveaux saveOt(@RequestBody OrdreTraveaux ot) {
		return otservice.saveOt(ot);
	}
	
	@PutMapping("/update/{id}")
	public OrdreTraveaux updateOt(@PathVariable Long id,@RequestBody OrdreTraveaux ot) {
		return otservice.updateOt(id, ot);
	}
	
	@GetMapping("/")
	public List<OrdreTraveaux> listeOt(){
		return otservice.listeOt();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOt(@PathVariable Long id) {
		otservice.deleteOt(id);
	}
	
	@GetMapping("/chercher/{id}")
	public OrdreTraveaux findOt(@PathVariable Long id) {
		return otservice.findByIdOt(id);
	}
}
