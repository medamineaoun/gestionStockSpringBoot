package tn.telecom.gestion_stock.service;

import java.util.List;

import tn.telecom.gestion_stock.model.Materiel;

public interface MaterielService {
	
	Materiel saveMateriel(Materiel materiel);
	Materiel updateMateriel(Long id,Materiel materiel);
	void deleteMateriel(Long id);
	List<Materiel> listemateriel();
	Materiel FindByIdMateriel(Long id);
}
