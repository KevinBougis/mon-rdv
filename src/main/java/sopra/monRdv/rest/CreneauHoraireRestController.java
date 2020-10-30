package sopra.monRdv.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import sopra.monRdv.model.CreneauHoraire;
import sopra.monRdv.model.Specialite;
import sopra.monRdv.model.Views;
import sopra.monRdv.repository.ICreneauHoraireRepository;


@RestController
@RequestMapping("/api/creneauHoraire")
@CrossOrigin("*")
public class CreneauHoraireRestController {
	@Autowired
	private ICreneauHoraireRepository creneauRepo;
	
	
	@GetMapping("")
	@JsonView(Views.ViewCreneauHoraire.class)
	public List<CreneauHoraire> findAll() {
	return creneauRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewCreneauHoraire.class)
	public CreneauHoraire findById(@PathVariable Long id) {
		Optional<CreneauHoraire> optcreneau = creneauRepo.findById(id);
		if (optcreneau.isPresent()) {
			return optcreneau.get();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
					"Unable to find resource");
		}	
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewCreneauHoraire.class)
	public CreneauHoraire update(@PathVariable Long id, 
			@RequestBody CreneauHoraire creneau) {
		if(!creneauRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
		creneau=creneauRepo.save(creneau);
		return creneau;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewCreneauHoraire.class)
	public CreneauHoraire create(@RequestBody CreneauHoraire creneau) {
	creneau = creneauRepo.save(creneau);
	
	return creneau;
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		creneauRepo.deleteById(id);
	}
	
//	@GetMapping("/by-Rdv/{id}")
//	@JsonView(Views.ViewCreneauHoraire.class)
//	public List<CreneauHoraire> findByRdv(@PathVariable Long id) {
//	return creneauRepo.findByRdv(id);
//	}
//	
//	@GetMapping("/by-plageHoraire/{id}")
//	@JsonView(Views.ViewCreneauHoraire.class)
//	public List<CreneauHoraire> findByPlageHoraire(@PathVariable Long id) {
//	return creneauRepo.findByPlageHoraire(id);
//	}
}
