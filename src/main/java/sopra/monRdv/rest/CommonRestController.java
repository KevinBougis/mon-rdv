package sopra.monRdv.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import sopra.monRdv.model.TypeUtilisateur;

@RestController
@RequestMapping ("/api")
@CrossOrigin("*")
public class CommonRestController {
	
	@GetMapping("/typeUtilisateur")
	public TypeUtilisateur[] getTypeUtilisateur() {
		return TypeUtilisateur.values();
	}
	
	
}