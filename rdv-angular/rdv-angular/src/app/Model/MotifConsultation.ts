import {RendezVous} from "./RendezVous";
import {CreneauHoraire} from "./CreneauHoraire";

export class MotifConsultation {
  id: number;
  version: number;
  nom: string;
  duree: string;

  rdvs: Array<RendezVous>;
  lieux: Array<Lieu>;

  constructor(id?: number, version?: number, nom?: string, duree?: string,
              rdvs?: Array<RendezVous>,
              lieux?: Array<Lieu>){
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.duree = duree;
    this.rdvs = rdvs;
    this.lieux = lieux;


  }
}
