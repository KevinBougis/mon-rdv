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

import sopra.monRdv.model.MotifConsultation;
import sopra.monRdv.model.Views;
import sopra.monRdv.repository.IMotifConsultationRepository;

@RestController
@RequestMapping("/api/motif")
public class MotifConsultationRestController {
	
	@Autowired
	private IMotifConsultationRepository motifRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewMotifConsultation.class)
	public List<MotifConsultation> findAll() {
	return motifRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMotifConsultation.class)
	public MotifConsultation findById(@PathVariable Long id) {
		Optional<MotifConsultation> optMotif = motifRepo.findById(id);
		if (optMotif.isPresent()) {
			return optMotif.get();
		}
		else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
					"Unable to find resource");
		}	
	}
	
	@PostMapping("")
	@JsonView(Views.ViewMotifConsultation.class)
	public MotifConsultation create(@RequestBody MotifConsultation motif) {
	motif = motifRepo.save(motif);
	return motif;
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewMotifConsultation.class)
	public MotifConsultation update(@PathVariable Long id, 
			@RequestBody MotifConsultation motif) {
		if(!motifRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
		motif=motifRepo.save(motif);
		return motif;	
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		motifRepo.deleteById(id);
	}
	
}
