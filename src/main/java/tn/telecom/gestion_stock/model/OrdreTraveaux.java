package tn.telecom.gestion_stock.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="ordreTraveauxx")
public class OrdreTraveaux {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero_ot;
	private String lieu;
	private String nature;
	private int quantite;
	private String observation;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", timezone = "Africa/Tunis")
	private Date date_ot ;
	
	@OneToMany
	List<Article> articles=new ArrayList<>();
	@OneToMany(mappedBy = "ordretraveaux" ,fetch = FetchType.LAZY)
	List<Materiel> materiels=new ArrayList<>();
	public OrdreTraveaux() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrdreTraveaux(Long numero_ot, String lieu, String nature, int quantite, String observation, Date date_ot,
			List<Article> articles, List<Materiel> materiels) {
		super();
		this.numero_ot = numero_ot;
		this.lieu = lieu;
		this.nature = nature;
		this.quantite = quantite;
		this.observation = observation;
		this.date_ot = date_ot;
		this.articles = articles;
		this.materiels = materiels;
	}
	public Long getNumero_ot() {
		return numero_ot;
	}
	public void setNumero_ot(Long numero_ot) {
		this.numero_ot = numero_ot;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public Date getDate_ot() {
		return date_ot;
	}
	public void setDate_ot(Date date_ot) {
		this.date_ot = date_ot;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public List<Materiel> getMateriels() {
		return materiels;
	}
	public void setMateriels(List<Materiel> materiels) {
		this.materiels = materiels;
	}
	
	
	
}
