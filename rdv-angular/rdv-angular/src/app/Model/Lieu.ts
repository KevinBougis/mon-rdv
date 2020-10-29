import {CompteUtilisateur} from './CompteUtilisateur';
import {MotifConsultation} from "./MotifConsultation";
import {PlageHoraire} from "./PlageHoraire";

export class Lieu {
  id: number;
  version: number;
  intitule: string;
  rue: string;
  complement: string;
  codePostal: string;
  ville: string;
  telephone: string;
  motifs: Array<MotifConsultation>;
  compteUsers: Array<CompteUtilisateur>;
  plages: Array<PlageHoraire>;

  constructor(id?: number, version?: number, intitule?: string, rue?: string, complement?: string, codePostal?: string,
              ville?: string, telephone?: string, motifs?: Array<MotifConsultation>, compteUsers?: Array<CompteUtilisateur>,
              plages?: Array<PlageHoraire>){
    this.id = id;
    this.version = version;
    this.intitule = intitule;
    this.rue = rue;
    this.complement = complement;
    this.codePostal = codePostal;
    this.ville = ville;
    this.telephone = telephone;
    this.motifs = motifs;
    this.compteUsers = compteUsers;
    this.plages = plages;
  }

}
