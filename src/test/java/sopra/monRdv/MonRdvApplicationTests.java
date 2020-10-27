package sopra.monRdv;

import javax.persistence.Temporal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.RendezVous;
import sopra.monRdv.model.TypeUtilisateur;
import sopra.monRdv.repository.ICompteUtilisateurRepository;
import sopra.monRdv.repository.IRendezVousRepository;

@SpringBootTest
class MonRdvApplicationTests {
	
	SimpleDateFormat sdf
	
	@Autowired
	private ICompteUtilisateurRepository userRepo;
	
	@Autowired
	private IRendezVousRepository rdvRepo;
	
	@Test
	void contextLoads() {
		CompteUtilisateur patient = new CompteUtilisateur("patientMdp", "patient", "Dupont", "Jean", "patient@patient.fr", 
				"05555555", TypeUtilisateur.Patient);
		
		patient = userRepo.save(patient);
		
		RendezVous rdv1 = new RendezVous()
		
	}

}
