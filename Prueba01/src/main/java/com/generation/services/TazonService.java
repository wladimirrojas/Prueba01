package com.generation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.models.Tazon;
import com.generation.repositories.TazonRepository;

@Service
public class TazonService {

	@Autowired
	TazonRepository tazonRepository;

	public void saveTazon(Tazon tazon) {
		tazonRepository.save(tazon);
	}

	public List<Tazon> findAll() {

		return tazonRepository.findAll();
	}

	public Tazon buscarId(Integer id) {

		return tazonRepository.findById(id).get();

	}

}
