package br.com.infinet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infinet.model.Planet;
import br.com.infinet.service.PlanetService;

@RestController
@RequestMapping("/planet")
public class PlanetController {
	@Autowired
	PlanetService planetService;
	@GetMapping
	public ResponseEntity<List<Planet>> getAll(){
		List<Planet> all = this.planetService.getAll();
		if(all.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok().body(all);
		}		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Planet> byId(@PathVariable Long id){
		Optional<Planet> byId = this.planetService.getById(id);
		if(byId.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(byId.get());
		}
		
	}

}
