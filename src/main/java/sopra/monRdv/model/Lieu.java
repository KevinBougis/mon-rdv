package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.List;

public class Lieu {

	
	private Long id;
	private int version;
	private String intitule;
	private String rue;
	private String complement;
	private String codePostal;
	private String ville;
	private String telephone;
	private List<MotifConsultation> motifConsultation= new ArrayList<MotifConsultation>();
	private List<CompteUtilisateur> compteUtilisateur= new ArrayList<CompteUtilisateur>();
	private List<PlageHoraire> plageHoraire= new ArrayList<PlageHoraire>();
	
	
	
	public Lieu() {
		super();
	}



	public Lieu(Long id, int version, String intitule, String rue, String complement, String codePostal, String ville,
			String telephone) {
		super();
		this.id = id;
		this.version = version;
		this.intitule = intitule;
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
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



	public String getIntitule() {
		return intitule;
	}



	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}



	public String getRue() {
		return rue;
	}



	public void setRue(String rue) {
		this.rue = rue;
	}



	public String getComplement() {
		return complement;
	}



	public void setComplement(String complement) {
		this.complement = complement;
	}



	public String getCodePostal() {
		return codePostal;
	}



	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}



	public String getVille() {
		return ville;
	}



	public void setVille(String ville) {
		this.ville = ville;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public List<MotifConsultation> getMotifConsultation() {
		return motifConsultation;
	}



	public void setMotifConsultation(List<MotifConsultation> motifConsultation) {
		this.motifConsultation = motifConsultation;
	}



	public List<CompteUtilisateur> getCompteUtilisateur() {
		return compteUtilisateur;
	}



	public void setCompteUtilisateur(List<CompteUtilisateur> compteUtilisateur) {
		this.compteUtilisateur = compteUtilisateur;
	}



	public List<PlageHoraire> getPlageHoraire() {
		return plageHoraire;
	}



	public void setPlageHoraire(List<PlageHoraire> plageHoraire) {
		this.plageHoraire = plageHoraire;
	}



	@Override
	public String toString() {
		return "Lieu [id=" + id + ", version=" + version + ", intitule=" + intitule + ", rue=" + rue + ", complement="
				+ complement + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + "]";
	}
	
	
	
}
