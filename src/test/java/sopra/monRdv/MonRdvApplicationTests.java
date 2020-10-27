package sopra.monRdv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.repository.ICompteUtilisateurRepository;
import sopra.monRdv.repository.ILieuRepository;

@SpringBootTest
class MonRdvApplicationTests {

	@Autowired
	private ICompteUtilisateurRepository userRepo;
	@Autowired
	private ILieuRepository lieuRepo;
	
	@Test
	void contextLoads() {
		
		CompteUtilisateur gyneco=new CompteUtilisateur();
		
		
		
	}

}
