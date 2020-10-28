package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;
@Entity
public class MotifConsultation {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@JsonView(Views.ViewCommon.class)
	private String duree;
	@JsonView(Views.ViewMotifConsultation.class)
	@OneToMany(mappedBy="motifConsultation")
	private List<RendezVous> rendezVous= new ArrayList<RendezVous>();
	@JsonView(Views.ViewMotifConsultation.class)
	@ManyToMany(mappedBy="motifConsultations")
	private List<Lieu> lieux= new ArrayList<Lieu>();
	
	public MotifConsultation() {
		super();
	}
	public MotifConsultation(String nom, String duree) {
		super();
		this.nom = nom;
		this.duree = duree;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	
	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}
	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}
	
	public List<Lieu> getLieux() {
		return lieux;
	}
	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}
	@Override
	public String toString() {
		return "MotifConsultation [id=" + id + ", version=" + version + ", nom=" + nom + ", duree=" + duree + "]";
	}
	
	
}
