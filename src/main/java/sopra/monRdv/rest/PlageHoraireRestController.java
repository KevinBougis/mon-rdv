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

import sopra.monRdv.model.CreneauHoraire;
import sopra.monRdv.model.PlageHoraire;
import sopra.monRdv.model.Views;
import sopra.monRdv.repository.IPlageHoraireRepository;

@RestController
@RequestMapping("/api/plage")
public class PlageHoraireRestController {

	
	@Autowired
	private IPlageHoraireRepository plageRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPlageHoraire.class)
	public List<PlageHoraire> findAll() {
	return plageRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPlageHoraire.class)
	public PlageHoraire findById(@PathVariable Long id) {
		Optional<PlageHoraire> optPlage = plageRepo.findById(id);
		if (optPlage.isPresent()) {
			return optPlage.get();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
					"Unable to find resource");
		}	
	}
	
	@PostMapping("")
	@JsonView(Views.ViewPlageHoraire.class)
	public PlageHoraire create(@RequestBody PlageHoraire plage) {
	plage = plageRepo.save(plage);
	return plage;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewPlageHoraire.class)
	public PlageHoraire update(@PathVariable Long id, 
			@RequestBody PlageHoraire plage) {
		if(!plageRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
		plage=plageRepo.save(plage);
		return plage;	
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		plageRepo.deleteById(id);
	}
	
	@GetMapping("/by-praticien/{id}")
	@JsonView(Views.ViewPlageHoraire.class)
	public List<PlageHoraire> findByPraticienId(@PathVariable Long id) {
	return plageRepo.findByPraticienId(id);
	}
	
	@GetMapping("/by-praticienAndLieu/{pr_id}|{l_id}")
	@JsonView(Views.ViewPlageHoraire.class)
	public List<PlageHoraire> findByPraticienAndLieu(@PathVariable Long pr_id,@PathVariable Long l_id) {
	return plageRepo.findByPraticienAndLieu(pr_id,l_id);
	}
}
