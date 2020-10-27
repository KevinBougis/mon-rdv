package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreneauHoraire {

	private Date dtDebut;
	private Date dtFin;
	private List<RendezVous> rendezVous= new ArrayList<RendezVous>();
	private List<PlageHoraire> plageHoraire= new ArrayList<PlageHoraire>();
	
	public CreneauHoraire() {
		super();
	}

	public CreneauHoraire(Date dtDebut, Date dtFin) {
		super();
		this.dtDebut = dtDebut;
		this.dtFin = dtFin;
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
