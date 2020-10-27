package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
public class RendezVous {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToMany(mappedBy = "rendezVous")
	private List<CompteUtilisateur> compteUtilisateurs= new ArrayList<CompteUtilisateur>();
	
	@ManyToMany
	@JoinTable(
	name = "rdvBrique",
	joinColumns = @JoinColumn(name = "rdv_id"),
	inverseJoinColumns = @JoinColumn(name = "creneau_id")                   
			)
	
	private List<CreneauHoraire> creneauHoraires= new ArrayList<CreneauHoraire>();
	@ManyToOne
	@JoinColumn (name = "motif_id")
	private MotifConsultation motifConsultation;
	
	public RendezVous() {
		super();
	}
	
	public RendezVous(Date date) {
		super();
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


	public List<CompteUtilisateur> getCompteUtilisateurs() {
		return compteUtilisateurs;
	}

	public void setCompteUtilisateurs(List<CompteUtilisateur> compteUtilisateurs) {
		this.compteUtilisateurs = compteUtilisateurs;
	}

	public List<CreneauHoraire> getCreneauHoraires() {
		return creneauHoraires;
	}

	public void setCreneauHoraires(List<CreneauHoraire> creneauHoraires) {
		this.creneauHoraires = creneauHoraires;
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
