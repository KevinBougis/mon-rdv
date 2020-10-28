package sopra.monRdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.model.RendezVous;

public interface IRendezVousRepository extends JpaRepository<RendezVous, Long>{
	
	@Query("select rdv from RendezVous rdv join rdv.CompteUtilisateur cu where cu.id = :id")
	List<RendezVous> findByPraticienId(@Param("id")Long id);

}
