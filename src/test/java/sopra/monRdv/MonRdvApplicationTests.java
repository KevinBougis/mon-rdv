package sopra.monRdv;

import javax.persistence.Temporal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.Grade;
import sopra.monRdv.model.Lieu;
import sopra.monRdv.model.Specialite;
import sopra.monRdv.model.TypeUtilisateur;
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
		
		CompteUtilisateur gyneco=new CompteUtilisateur("gynecoMdp","gyneco","Ferdinand","Ahmed","ahmed.ferdinand@gmail.com",TypeUtilisateur.Praticien,Grade.Pr,Specialite.Gynecologue);
		userRepo.save(gyneco);
		
		Lieu hopital=new Lieu("Pellegrin","53 rue de la rivière","3 Etage","33000","Mérignac","0556374567");
		lieuRepo.save(hopital);
		
		
	}

}
