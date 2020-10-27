package sopra.monRdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.CreneauHoraire;
import sopra.monRdv.model.RendezVous;
import sopra.monRdv.model.TypeUtilisateur;
import sopra.monRdv.repository.ICompteUtilisateurRepository;
import sopra.monRdv.repository.ICreneauHoraireRepository;
import sopra.monRdv.repository.IRendezVousRepository;

@SpringBootTest
class MonRdvApplicationTests {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
	
	@Autowired
	private ICompteUtilisateurRepository userRepo;
	
	@Autowired
	private IRendezVousRepository rdvRepo;
	
	@Autowired
	private ICreneauHoraireRepository creneauRepo;
	
	@Test
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
