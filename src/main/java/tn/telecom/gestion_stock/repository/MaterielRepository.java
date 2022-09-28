package tn.telecom.gestion_stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.telecom.gestion_stock.model.Materiel;

public interface MaterielRepository extends JpaRepository<Materiel, Long> {

}
