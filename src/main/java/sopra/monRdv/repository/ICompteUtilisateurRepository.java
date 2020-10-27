package sopra.monRdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.monRdv.model.CompteUtilisateur;

public interface ICompteUtilisateurRepository extends JpaRepository<CompteUtilisateur,Long> {

}
