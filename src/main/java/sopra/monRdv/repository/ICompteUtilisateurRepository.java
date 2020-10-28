package sopra.monRdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.Specialite;

public interface ICompteUtilisateurRepository extends JpaRepository<CompteUtilisateur,Long> {
	
	List<CompteUtilisateur> findBySpecialite(Specialite specialite);
	
	@Query("select cu from CompteUtilisateur cu join cu.lieu l  where l.ville = :town")
	List<CompteUtilisateur> findByVille(@Param("town")String ville);
}
