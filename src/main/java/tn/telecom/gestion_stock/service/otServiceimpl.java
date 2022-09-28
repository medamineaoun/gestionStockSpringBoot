package tn.telecom.gestion_stock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tn.telecom.gestion_stock.model.OrdreTraveaux;
import tn.telecom.gestion_stock.repository.OrdreTraveauxRepository;

@Service
public class otServiceimpl implements otService {
	
	private OrdreTraveauxRepository otrepository;

	@Override
	public void deleteOt(Long id) {
		// TODO Auto-generated method stub
		otrepository.deleteById(id);
	}

	@Override
	public OrdreTraveaux saveOt(OrdreTraveaux ot) {
		// TODO Auto-generated method stub
		return otrepository.save(ot);
	}

	@Override
	public List<OrdreTraveaux> listeOt() {
		// TODO Auto-generated method stub
		return otrepository.findAll();
	}

	@Override
	public OrdreTraveaux updateOt(Long id, OrdreTraveaux ot) {
		// TODO Auto-generated method stub
		Optional<OrdreTraveaux> optionalot=otrepository.findById(id);
		if (optionalot.isPresent()) {
			
			OrdreTraveaux ots=optionalot.get();
			
			ots.setNature(ot.getNature());
			ots.setQuantite(ot.getQuantite());
			ots.setObservation(ot.getObservation());
			ots.setQuantite(ot.getQuantite());
				return otrepository.save(ots);
		}
		else {
			return null;
		}
	}

	@Override
	public OrdreTraveaux findByIdOt(Long id) {
		// TODO Auto-generated method stub
		return otrepository.findById(id).get();
	}

}
