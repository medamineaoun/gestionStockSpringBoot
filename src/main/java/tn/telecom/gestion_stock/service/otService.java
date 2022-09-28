package tn.telecom.gestion_stock.service;

import java.util.List;

import tn.telecom.gestion_stock.model.OrdreTraveaux;

public interface otService {
	void deleteOt(Long id);
	OrdreTraveaux saveOt(OrdreTraveaux ot);
	  List<OrdreTraveaux> listeOt(); 
	  OrdreTraveaux updateOt(Long id,OrdreTraveaux ot); 
	  OrdreTraveaux  findByIdOt(Long id);
}
