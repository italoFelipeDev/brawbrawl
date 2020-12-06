package br.com.brawbrawlbd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.brawbrawlbd.model.Jogada;


@RepositoryRestResource(collectionResourceRel="jogada",path="jogada")
public interface JogadaRepository extends PagingAndSortingRepository<Jogada,Integer> {
	
	
	//@Query("SELECT SUM(j.dano) FROM jogada j WHERE j.jogador_id = :id")
	//public int PlayerDamage(@Param("id") int id); 
	

}
