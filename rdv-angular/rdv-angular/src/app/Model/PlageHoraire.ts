import {RendezVous} from "./RendezVous";
import {CreneauHoraire} from "./CreneauHoraire";

export class PlageHoraire {
  id:number;
  version:number;
  jourAnnee:Date;
  indispoDebut:Date;
  indispoFin:Date;
  jourSemaine: string;
  semaine: boolean;

  lieux: Array<Lieu>;
  creneaux: Array<CreneauHoraire>;

  constructor(id?: number, version?: number, jourAnnee?: Date, indispoDebut?: Date, indispoFin?: Date,
              jourSemaine?: string, semaine?: boolean,
              lieux?: Array<Lieu>,
              creneaux?: Array<CreneauHoraire>){
    this.id = id;
    this.version = version;
    this.jourAnnee = jourAnnee;
    this.indispoDebut = indispoDebut;
    this.indispoFin = indispoFin;
    this.jourSemaine = jourSemaine;
    this.semaine = semaine;
    this.lieux = lieux;
    this.creneaux = creneaux;

  }
}
