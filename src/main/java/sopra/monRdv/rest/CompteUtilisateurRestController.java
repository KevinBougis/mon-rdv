package sopra.monRdv.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonView;

import sopra.monRdv.model.CompteUtilisateur;
import sopra.monRdv.model.Specialite;
import sopra.monRdv.model.Views;
import sopra.monRdv.repository.ICompteUtilisateurRepository;


@RestController
@RequestMapping("/api/user")
public class CompteUtilisateurRestController {

	@Autowired
	private ICompteUtilisateurRepository userRepo;
	
	
	@GetMapping("")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public List<CompteUtilisateur> findAll() {
	return userRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public CompteUtilisateur findById(@PathVariable Long id) {
		Optional<CompteUtilisateur> optUser = userRepo.findById(id);
		if (optUser.isPresent()) {
			return optUser.get();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
					"Unable to find resource");
		}	
	}
	
	@PostMapping("")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public CompteUtilisateur create(@RequestBody CompteUtilisateur user) {
	user = userRepo.save(user);
	
	return user;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public CompteUtilisateur update(@PathVariable Long id, 
			@RequestBody CompteUtilisateur user) {
		if(!userRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
		user=userRepo.save(user);
		return user;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		userRepo.deleteById(id);
	}
	
	@GetMapping("/by-Specialite/{specialite}")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public List<CompteUtilisateur> findBySpecialite(@PathVariable Specialite specialite) {
	return userRepo.findBySpecialite(specialite);
	}
	
	@GetMapping("/by-Ville/{ville}")
	@JsonView(Views.ViewCompteUtilisateur.class)
	public List<CompteUtilisateur> findByVille(@PathVariable String ville) {
	return userRepo.findByVille(ville);
	}
}
