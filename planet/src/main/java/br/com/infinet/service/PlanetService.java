package br.com.infinet.service;

import java.util.List;
import java.util.Optional;

import br.com.infinet.model.Planet;

public interface PlanetService {
	void add(Planet planet);
	Optional<Planet> getById(Long id);
	List<Planet> getAll();
}
