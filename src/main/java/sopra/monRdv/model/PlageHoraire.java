package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlageHoraire {

	
	private Long id;
	private int version;
	private Date jourAnnee;
	private Date indispoDebut;
	private Date indispoFin;
	private Boolean semaine;
	private JourSemaine jourSemaine;
	
	private List<Lieu> lieu= new ArrayList<Lieu>();
	private List<CreneauHoraire> creneauHoraire= new ArrayList<CreneauHoraire>();
	
	public PlageHoraire() {
		super();
	}
	public PlageHoraire(Long id, int version, Date jourAnnee, Date indispoDebut, Date indispoFin, Boolean semaine,
			JourSemaine jourSemaine) {
		super();
		this.id = id;
		this.version = version;
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
	
	
	public List<Lieu> getLieu() {
		return lieu;
	}
	public void setLieu(List<Lieu> lieu) {
		this.lieu = lieu;
	}
	public List<CreneauHoraire> getCreneauHoraire() {
		return creneauHoraire;
	}
	public void setCreneauHoraire(List<CreneauHoraire> creneauHoraire) {
		this.creneauHoraire = creneauHoraire;
	}
	@Override
	public String toString() {
		return "PlageHoraire [id=" + id + ", version=" + version + ", jourAnnee=" + jourAnnee + ", indispoDebut="
				+ indispoDebut + ", indispoFin=" + indispoFin + ", semaine=" + semaine + ", jourSemaine=" + jourSemaine
				+ "]";
	}

	
}
