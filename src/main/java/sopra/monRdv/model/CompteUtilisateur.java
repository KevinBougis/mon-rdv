package sopra.monRdv.model;

import java.util.ArrayList;
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
public class CompteUtilisateur {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	private String mdp;
	private String identifiant;
	private String nom;
	private String prenom;
	private String mail;
	private String telephone;
	@Enumerated
	private TypeUtilisateur typeUtilisateur;
	@Enumerated
	private Grade grade;
	@Enumerated
	private Specialite specialite;
	@ManyToMany
	@JoinTable (
	name="userRdv", 
	joinColumns = @JoinColumn(name = "compteUtilisateur_id"),
	inverseJoinColumns = @JoinColumn(name = "rdv_id"))
	private List<RendezVous> rendezVous= new ArrayList<RendezVous>();
	
	@ManyToMany
	@JoinTable (
	name = "userPlace",
	joinColumns = @JoinColumn(name = "compteUtilisateur_id"),
	inverseJoinColumns = @JoinColumn(name = "lieu_id"))
	private List<Lieu> lieux= new ArrayList<Lieu>();
	
	
	public CompteUtilisateur() {
		super();
	}


	
public CompteUtilisateur(Long id, int version, String mdp, String identifiant, String nom, String prenom,
			String mail, String telephone, TypeUtilisateur typeUtilisateur, Grade grade, Specialite specialite) {
		super();
		this.id = id;
		this.version = version;
		this.mdp = mdp;
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.telephone = telephone;
		this.typeUtilisateur = typeUtilisateur;
		this.grade = grade;
		this.specialite = specialite;
	}





	
	
//Constructeur Admin
	public CompteUtilisateur(Long id, int version, String mdp, String identifiant) {
	super();
	this.id = id;
	this.version = version;
	this.mdp = mdp;
	this.identifiant = identifiant;
}


	//Constructeur Patient
	public CompteUtilisateur(Long id, int version, String mdp, String identifiant, String nom, String prenom, String mail,
		String telephone, TypeUtilisateur typeUtilisateur) {
	super();
	this.id = id;
	this.version = version;
	this.mdp = mdp;
	this.identifiant = identifiant;
	this.nom = nom;
	this.prenom = prenom;
	this.mail = mail;
	this.telephone = telephone;
	this.typeUtilisateur = typeUtilisateur;
}


	//Constructeur Praticien
	public CompteUtilisateur(Long id, int version, String mdp, String identifiant, String nom, String prenom,
			String mail, TypeUtilisateur typeUtilisateur, Grade grade, Specialite specialite) {
		super();
		this.id = id;
		this.version = version;
		this.mdp = mdp;
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.typeUtilisateur = typeUtilisateur;
		this.grade = grade;
		this.specialite = specialite;
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


	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}


	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}


	public Grade getGrade() {
		return grade;
	}


	public void setGrade(Grade grade) {
		this.grade = grade;
	}


	public Specialite getSpecialite() {
		return specialite;
	}


	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
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
		return "CompteUtilisateur [id=" + id + ", version=" + version + ", mdp=" + mdp + ", identifiant=" + identifiant
				+ ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", telephone=" + telephone
				+ ", typeUtilisateur=" + typeUtilisateur + ", grade=" + grade + ", specialite=" + specialite + "]";
	}


	

	
	
}
