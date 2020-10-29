export class CompteUtilisateur{
  id: number;
  version: number;
  mdp: string;
  identifiant: string;
  nom: string;
  prenom: string;
  mail: string;
  telephone: string;
  typeUtilisateur: string;
  grade: string;
  specialite: string;
  rdvs: Array<RendezVous>;
  lieux: Array<Lieu>;

  constructor(id?: number, version?: number, mdp?: string, identifiant?: string, nom?: string, prenom?: string,
              mail?: string, telephone?: string, typeUtilisateur?: string, grade?: string, specialite?: string,
              rdvs?: Array<RendezVous>, lieux?: Array<Lieu>) {
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
    this.rdvs = rdvs;
    this.lieux = lieux;
  }
}
