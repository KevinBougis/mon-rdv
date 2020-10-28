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

import sopra.monRdv.model.RendezVous;
import sopra.monRdv.model.Views;
import sopra.monRdv.repository.IRendezVousRepository;

@RestController
@RequestMapping("/api/rdv")
public class RendezVousRestController {


	@Autowired
	private IRendezVousRepository rdvRepo;
	
	
	@GetMapping("")
	@JsonView(Views.ViewRdv.class)
	public List<RendezVous> findAll() {
	return rdvRepo.findAll();
	}
	
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewRdv.class)
	public RendezVous findById(@PathVariable Long id) {
		Optional<RendezVous> optRdv = rdvRepo.findById(id);
		if (optRdv.isPresent()) {
			return optRdv.get();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
					"Unable to find resource");
		}	
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewRdv.class)
	public RendezVous update(@PathVariable Long id, 
			@RequestBody RendezVous rdv) {
		if(!rdvRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
		rdv=rdvRepo.save(rdv);
		return rdv;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewRdv.class)
	public RendezVous create(@RequestBody RendezVous rdv) {
	rdv = rdvRepo.save(rdv);
	
	return rdv;
	}
	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		rdvRepo.deleteById(id);
	}
}
