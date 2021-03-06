package com.everton.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everton.cursomc.domain.Categoria;
import com.everton.cursomc.repositories.CategoriaRepository;
import com.everton.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encotrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	
}
