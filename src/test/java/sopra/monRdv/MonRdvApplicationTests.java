package sopra.monRdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.Grade;
import sopra.monRdv.model.JourSemaine;
import sopra.monRdv.model.Lieu;
import sopra.monRdv.model.MotifConsultation;
import sopra.monRdv.model.PlageHoraire;
import sopra.monRdv.model.Specialite;
import sopra.monRdv.model.CreneauHoraire;
import sopra.monRdv.model.RendezVous;
import sopra.monRdv.model.TypeUtilisateur;
import sopra.monRdv.repository.ICompteUtilisateurRepository;
import sopra.monRdv.repository.ILieuRepository;
import sopra.monRdv.repository.IMotifConsultationRepository;
import sopra.monRdv.repository.IPlageHoraireRepository;
import sopra.monRdv.repository.ICreneauHoraireRepository;
import sopra.monRdv.repository.IRendezVousRepository;

@SpringBootTest
class MonRdvApplicationTests {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
	
	@Autowired
	private ICompteUtilisateurRepository userRepo;
	@Autowired
	private ILieuRepository lieuRepo;
	@Autowired
	private IMotifConsultationRepository motifRepo;
	@Autowired
	private IPlageHoraireRepository plageRepo;

	private IRendezVousRepository rdvRepo;
	
	@Autowired
	private ICreneauHoraireRepository creneauRepo;
	
	@Test
	void contextLoads() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Lieu> lieux = new ArrayList<Lieu>();
		List<MotifConsultation> motifs = new ArrayList<MotifConsultation>();
		List<PlageHoraire> plages = new ArrayList<PlageHoraire>();
		// Praticien
		CompteUtilisateur gyneco = new CompteUtilisateur("gynecoMdp", "gyneco", "Ferdinand", "Ahmed",
				"ahmed.ferdinand@gmail.com", TypeUtilisateur.Praticien, Grade.Pr, Specialite.Gynecologue);
		userRepo.save(gyneco);
		//Lieu
		Lieu hopital = new Lieu("Pellegrin", "53 rue de la rivière", "3 Etage", "33000", "Mérignac", "0556374567");
		lieuRepo.save(hopital);
		//Motif
		MotifConsultation diagnostique = new MotifConsultation("diagnostique", "30min");
		motifRepo.save(diagnostique);
		// Plage Horaire
		Date indispoDebut = new Date();
		Date indispoFin = new Date();
		Date jourAnnee = new Date();

		indispoDebut = sdf.parse("12/12/2020");
		indispoFin = sdf.parse("31/12/2020");
		jourAnnee = sdf.parse("05/12/2020");

		PlageHoraire plageHoraire1 = new PlageHoraire(indispoDebut, indispoFin);
		PlageHoraire plageHoraire2 = new PlageHoraire(jourAnnee);
		PlageHoraire plageHoraire3 = new PlageHoraire(true, JourSemaine.Lundi);
		plageRepo.save(plageHoraire1);
		plageRepo.save(plageHoraire2);
		plageRepo.save(plageHoraire3);

		//Lien praticien/lieu
		lieux.add(hopital);
		gyneco.setLieux(lieux);
		userRepo.save(gyneco);
		//Lieu/Motif
		motifs.add(diagnostique);
		hopital.setMotifConsultations(motifs);
		//lieuRepo.save(hopital);
		//Lieu /plage horaire
		plages.add(plageHoraire1);
		plages.add(plageHoraire2);
		plages.add(plageHoraire3);
		hopital.setPlageHoraires(plages);
		lieuRepo.save(hopital);
	void contextLoads() throws ParseException {
		
		//UTILISATEUR PATIENT
		CompteUtilisateur patient = new CompteUtilisateur("patientMdp", "patient", "Dupont", "Jean", "patient@patient.fr", 
				"05555555", TypeUtilisateur.Patient);
		
		patient = userRepo.save(patient);
		
		//RDV RDV1 AFFECTE A PATIENT
		List<RendezVous> rendezVouss = new ArrayList<RendezVous>();
		
		RendezVous rdv1 = new RendezVous(sdf.parse("27/10/2020"));
		
		rendezVouss.add(rdv1);
		
		rdv1 = rdvRepo.save(rdv1);
		
		patient.setRendezVous(rendezVouss);
		
		patient = userRepo.save(patient);
		
		
		//CRENEAU AFFECTE A RDV1
		List<CreneauHoraire> creneauHoraires = new ArrayList<CreneauHoraire>();
		
		CreneauHoraire creneau1 = new CreneauHoraire(sdfTime.parse("8:00"), sdfTime.parse("8:15"));
		
		creneauHoraires.add(creneau1);
		
		creneau1 = creneauRepo.save(creneau1);
		
		rdv1.setCreneauHoraires(creneauHoraires);
		
		rdv1 = rdvRepo.save(rdv1);
		
		
	}

}
