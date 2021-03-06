package br.com.infinet.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infinet.model.Planet;
import br.com.infinet.repository.PlanetRepository;
import br.com.infinet.service.PlanetService;

@Service
public class PlanetServiceImpl implements PlanetService {
	@Autowired
	PlanetRepository planetRepository;
	@Override
	public void add(Planet planet) {
		this.planetRepository.save(planet);
		
	}

	@Override
	public Optional<Planet> getById(Long id) {
		return this.planetRepository.findById(id);
		
	}

	@Override
	public List<Planet> getAll() {
		return (List<Planet>) this.planetRepository.findAll();
		
	}
	

}
