package tn.telecom.gestion_stock.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="materiels")

public class Materiel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idMateriel;
	private String designation;
	private String unite;
	private Double prixUnitaire;
	private int quantite;
	
	@ManyToOne
	private OrdreTraveaux ordretraveaux;
	
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Materiel(Long idMateriel, String designation, String unite, Double prixUnitaire, int quantite,
			OrdreTraveaux ordretraveaux) {
		super();
		this.idMateriel = idMateriel;
		this.designation = designation;
		this.unite = unite;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
	}

	public Long getIdMateriel() {
		return idMateriel;
	}

	public void setIdMateriel(Long idMateriel) {
		this.idMateriel = idMateriel;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public OrdreTraveaux getOrdretraveaux() {
		return ordretraveaux;
	}

	public void setOrdretraveaux(OrdreTraveaux ordretraveaux) {
		this.ordretraveaux = ordretraveaux;
	}
	
	

}
