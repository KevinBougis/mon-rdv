import {PlageHoraire} from "./PlageHoraire";
import {MotifConsultation} from "./MotifConsultation";
import {CreneauHoraire} from "./CreneauHoraire";
import {CompteUtilisateur} from "./CompteUtilisateur";

export class RendezVous {
  id:number;
  version:number;
  date:Date;

  motifs: Array<MotifConsultation>;
  creneaux: Array<CreneauHoraire>;
  users: Array<CompteUtilisateur>;

  constructor(id?: number, version?: number, date?: Date,
              users?: Array<CompteUtilisateur>,
              creneaux?: Array<CreneauHoraire>,
              motifs?: Array<MotifConsultation>){
    this.id = id;
    this.version = version;
    this.date = date;
    this.motifs = motifs;
    this.creneaux = creneaux;
    this.users = users;


  }

}
