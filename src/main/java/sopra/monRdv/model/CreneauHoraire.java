package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;

@Entity
public class CreneauHoraire {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm",locale="fr-FR",timezone = "Europe/Paris")
	@JsonView(Views.ViewCommon.class)
	private Date dtDebut;
	@Temporal(TemporalType.TIME)
	@JsonFormat(pattern="HH:mm",locale="fr-FR",timezone = "Europe/Paris")
	@JsonView(Views.ViewCommon.class)
	private Date dtFin;
	@ManyToMany(mappedBy = "creneauHoraires")
	private List<RendezVous> rendezVous = new ArrayList<RendezVous>();
	@ManyToMany(mappedBy = "creneauHoraires")
	private List<PlageHoraire> plageHoraires = new ArrayList<PlageHoraire>();

	public CreneauHoraire() {
		super();
	}


	public CreneauHoraire(Date dtDebut, Date dtFin) {
		super();
		this.dtDebut = dtDebut;
		this.dtFin = dtFin;
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

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	

	public List<PlageHoraire> getPlageHoraires() {
		return plageHoraires;
	}



	public void setPlageHoraires(List<PlageHoraire> plageHoraires) {
		this.plageHoraires = plageHoraires;
	}



	public Date getDtDebut() {
		return dtDebut;
	}

	public void setDtDebut(Date dtDebut) {
		this.dtDebut = dtDebut;
	}

	public Date getDtFin() {
		return dtFin;
	}

	public void setDtFin(Date dtFin) {
		this.dtFin = dtFin;
	}

	@Override
	public String toString() {
		return "CreneauHoraire [dtDebut=" + dtDebut + ", dtFin=" + dtFin + "]";
	}

}
