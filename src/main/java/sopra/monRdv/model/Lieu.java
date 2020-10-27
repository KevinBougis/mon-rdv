package sopra.monRdv.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity
public class Lieu {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String intitule;
	private String rue;
	private String complement;
	private String codePostal;
	private String ville;
	private String telephone;
	@ManyToMany
	@JoinTable (
	name="lieuMotif", 
	joinColumns = @JoinColumn(name = "lieu_id"),
	inverseJoinColumns = @JoinColumn(name = "motif_id"))
	private List<MotifConsultation> motifConsultations= new ArrayList<MotifConsultation>();
	@ManyToMany(mappedBy="lieux")
	private List<CompteUtilisateur> compteUtilisateurs= new ArrayList<CompteUtilisateur>();
	@ManyToMany
	@JoinTable (
	name="lieuPlage", 
	joinColumns = @JoinColumn(name = "lieu_id"),
	inverseJoinColumns = @JoinColumn(name = "plage_id"))
	private List<PlageHoraire> plageHoraires= new ArrayList<PlageHoraire>();
	
	
	
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



	public List<MotifConsultation> getMotifConsultations() {
		return motifConsultations;
	}



	public void setMotifConsultations(List<MotifConsultation> motifConsultations) {
		this.motifConsultations = motifConsultations;
	}



	public List<CompteUtilisateur> getCompteUtilisateurs() {
		return compteUtilisateurs;
	}



	public void setCompteUtilisateurs(List<CompteUtilisateur> compteUtilisateurs) {
		this.compteUtilisateurs = compteUtilisateurs;
	}



	public List<PlageHoraire> getPlageHoraires() {
		return plageHoraires;
	}



	public void setPlageHoraires(List<PlageHoraire> plageHoraires) {
		this.plageHoraires = plageHoraires;
	}



	@Override
	public String toString() {
		return "Lieu [id=" + id + ", version=" + version + ", intitule=" + intitule + ", rue=" + rue + ", complement="
				+ complement + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + "]";
	}
	
	
	
}
