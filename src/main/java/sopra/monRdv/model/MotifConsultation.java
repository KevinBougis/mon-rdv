package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.List;

public class MotifConsultation {

	private Long id;
	private int version;
	private String nom;
	private String duree;
	
	private List<RendezVous> rendezVous= new ArrayList<RendezVous>();
	private List<Lieu> lieu= new ArrayList<Lieu>();
	
	public MotifConsultation() {
		super();
	}
	public MotifConsultation(Long id, int version, String nom, String duree) {
		super();
		this.id = id;
		this.version = version;
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
	public List<Lieu> getLieu() {
		return lieu;
	}
	public void setLieu(List<Lieu> lieu) {
		this.lieu = lieu;
	}
	@Override
	public String toString() {
		return "MotifConsultation [id=" + id + ", version=" + version + ", nom=" + nom + ", duree=" + duree + "]";
	}
	
	
}
