package br.ufes.ceunes.projeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufes.ceunes.projeta.model.Membro;

public interface JPAmembro extends JpaRepository<Membro, Integer> {

	

}