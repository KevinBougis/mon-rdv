package sopra.monRdv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.repository.ICompteUtilisateurRepository;
import sopra.monRdv.repository.IRendezVousRepository;

@SpringBootTest
class MonRdvApplicationTests {
	
	@Autowired
	private ICompteUtilisateurRepository userRepo;
	
	@Autowired
	private IRendezVousRepository rdvRepo;
	
	@Test
	void contextLoads() {
		CompteUtilisateur patient = new CompteUtilisateur
		
	}

}
