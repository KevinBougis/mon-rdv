package sopra.monRdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sopra.monRdv.model.CreneauHoraire;
import sopra.monRdv.model.PlageHoraire;

public interface ICreneauHoraireRepository extends JpaRepository<CreneauHoraire,Long>{

	
//	@Query("select cH from CreneauHoraire cH join cH.RendezVous rdv where rdv.id = :id")
//	List<CreneauHoraire> findByRdv(@Param("id")Long id);
//	
//	@Query("select cH from CreneauHoraire cH join cH.PlageHoraire pH where pH.id = :id")
//	List<CreneauHoraire> findByPlageHoraire(@Param("id")Long id);
}
