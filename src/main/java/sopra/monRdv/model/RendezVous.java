package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendezVous {

	
	private Long id;
	private int version;
	private Date date;
	
	private List<CompteUtilisateur> compteUtilisateur= new ArrayList<CompteUtilisateur>();
	private List<CreneauHoraire> creneauHoraire= new ArrayList<CreneauHoraire>();
	private MotifConsultation motifConsultation;
	
	public RendezVous() {
		super();
	}
	
	public RendezVous(Long id, int version, Date date) {
		super();
		this.id = id;
		this.version = version;
		this.date = date;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	public List<CompteUtilisateur> getCompteUtilisateur() {
		return compteUtilisateur;
	}

	public void setCompteUtilisateur(List<CompteUtilisateur> compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}

	public List<CreneauHoraire> getCreneauHoraire() {
		return creneauHoraire;
	}

	public void setCreneauHoraire(List<CreneauHoraire> creneauHoraire) {
		this.creneauHoraire = creneauHoraire;
	}

	public MotifConsultation getMotifConsultation() {
		return motifConsultation;
	}

	public void setMotifConsultation(MotifConsultation motifConsultation) {
		this.motifConsultation = motifConsultation;
	}

	@Override
	public String toString() {
		return "RendezVous [id=" + id + ", version=" + version + ", date=" + date + "]";
	}
	
	
}
