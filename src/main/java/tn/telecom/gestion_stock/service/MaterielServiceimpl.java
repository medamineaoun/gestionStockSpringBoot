package tn.telecom.gestion_stock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.telecom.gestion_stock.model.Materiel;
import tn.telecom.gestion_stock.repository.MaterielRepository;

@Service
public class MaterielServiceimpl implements MaterielService {
	@Autowired
	private MaterielRepository materielrepository;
	
	@Override
	public void deleteMateriel(Long id) {
		materielrepository.deleteById(id);
	}

	@Override
	public Materiel saveMateriel(Materiel materiels) {
		return materielrepository.save(materiels);
	}

	@Override
	public List<Materiel> listemateriel() {
		return materielrepository.findAll();
	}

	@Override
	public Materiel updateMateriel(Long id, Materiel materiel) {
		
		Optional<Materiel> optionalmateriel=materielrepository.findById(id);
		if (optionalmateriel.isPresent()) {
			
			Materiel materiels=optionalmateriel.get();
			materiels.setIdMateriel(materiel.getIdMateriel());
			materiels.setDesignation(materiel.getDesignation());
			materiels.setUnite(materiel.getUnite());
			materiels.setPrixUnitaire(materiel.getPrixUnitaire());
			materiels.setQuantite(materiel.getQuantite());
				return materielrepository.save(materiels);
		}
		else {
			return null;
		}
	}

	@Override
	public Materiel FindByIdMateriel(Long id) {
		// TODO Auto-generated method stub
		return materielrepository.findById(id).get();
	}
}
