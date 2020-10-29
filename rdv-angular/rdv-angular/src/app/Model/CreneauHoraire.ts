import {RendezVous} from "./RendezVous";
import {PlageHoraire} from "./PlageHoraire";


export class CreneauHoraire {

  id:number;
  version:number;
  dtDebut:Date;
  dtFin:Date;

  rdvs: Array<RendezVous>;
  plages: Array<PlageHoraire>;

  constructor(id?: number, version?: number, dtDebut?: Date, dtFin?: Date,
              rdvs?: Array<RendezVous>,
              plages?: Array<PlageHoraire>){
    this.id = id;
    this.version = version;
    this.dtDebut = dtDebut;
    this.dtFin = dtFin;
    this.plages = plages;
    this.rdvs = rdvs;

  }

}
