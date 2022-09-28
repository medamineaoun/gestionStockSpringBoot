package tn.telecom.gestion_stock.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="articles")

public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numArticle;
	private String designation;
	private String unite;
	private Double prixUnitaire;
	
	@ManyToOne
	private OrdreTraveaux ordretraveaux;
	

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(Long numArticle, String designation, String unite, Double prixUnitaire,
			OrdreTraveaux ordretraveaux) {
		super();
		this.numArticle = numArticle;
		this.designation = designation;
		this.unite = unite;
		this.prixUnitaire = prixUnitaire;
	}

	public Long getNumArticle() {
		return numArticle;
	}

	public void setNumArticle(Long numArticle) {
		this.numArticle = numArticle;
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
	
	public OrdreTraveaux getOrdretraveaux() {
		return ordretraveaux;
	}

	public void setOrdretraveaux(OrdreTraveaux ordretraveaux) {
		this.ordretraveaux = ordretraveaux;
	}
}
