package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
@Entity
public class PlageHoraire {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private Date jourAnnee;
	private Date indispoDebut;
	private Date indispoFin;
	private Boolean semaine;
	@Enumerated
	private JourSemaine jourSemaine;
	
	@ManyToMany(mappedBy="plageHoraires")
	private List<Lieu> lieux= new ArrayList<Lieu>();
	@ManyToMany
	@JoinTable (
	name = "plageBrique",
	joinColumns = @JoinColumn(name = "plage_id"),
	inverseJoinColumns = @JoinColumn(name = "creneau_id"))
	private List<CreneauHoraire> creneauHoraires= new ArrayList<CreneauHoraire>();
	
	public PlageHoraire() {
		super();
	}
	public PlageHoraire(Date jourAnnee, Date indispoDebut, Date indispoFin, Boolean semaine,
			JourSemaine jourSemaine) {
		super();
		this.jourAnnee = jourAnnee;
		this.indispoDebut = indispoDebut;
		this.indispoFin = indispoFin;
		this.semaine = semaine;
		this.jourSemaine = jourSemaine;
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
	public Date getJourAnnee() {
		return jourAnnee;
	}
	public void setJourAnnee(Date jourAnnee) {
		this.jourAnnee = jourAnnee;
	}
	public Date getIndispoDebut() {
		return indispoDebut;
	}
	public void setIndispoDebut(Date indispoDebut) {
		this.indispoDebut = indispoDebut;
	}
	public Date getIndispoFin() {
		return indispoFin;
	}
	public void setIndispoFin(Date indispoFin) {
		this.indispoFin = indispoFin;
	}
	public Boolean getSemaine() {
		return semaine;
	}
	public void setSemaine(Boolean semaine) {
		this.semaine = semaine;
	}
	public JourSemaine getJourSemaine() {
		return jourSemaine;
	}
	public void setJourSemaine(JourSemaine jourSemaine) {
		this.jourSemaine = jourSemaine;
	}
	
	
	
	public List<Lieu> getLieux() {
		return lieux;
	}
	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}
	public List<CreneauHoraire> getCreneauHoraires() {
		return creneauHoraires;
	}
	public void setCreneauHoraires(List<CreneauHoraire> creneauHoraires) {
		this.creneauHoraires = creneauHoraires;
	}
	@Override
	public String toString() {
		return "PlageHoraire [id=" + id + ", version=" + version + ", jourAnnee=" + jourAnnee + ", indispoDebut="
				+ indispoDebut + ", indispoFin=" + indispoFin + ", semaine=" + semaine + ", jourSemaine=" + jourSemaine
				+ "]";
	}

	
}
