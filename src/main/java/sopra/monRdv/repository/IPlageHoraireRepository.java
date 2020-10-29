package sopra.monRdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.model.PlageHoraire;


public interface IPlageHoraireRepository extends JpaRepository<PlageHoraire, Long>{

	
//	@Query("select pH from plageHoraire pH join pH.lieu l join l.compteUtilisateur cu where cu.id = :id")
//	List<PlageHoraire> findByPraticienId(@Param("id")Long id);
	
	//@Query("select pH from plageHoraire pH join pH.lieu l join l.compteUtilisateur cu where cu.id = :pr_id AND l.id = :l_id")
	//List<PlageHoraire> findByPraticienAndLieu(@Param("pr_id")Long pr_id,@Param("l_id")Long l_id);
}
