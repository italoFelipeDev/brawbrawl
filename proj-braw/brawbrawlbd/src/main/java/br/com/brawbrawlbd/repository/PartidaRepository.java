package br.com.brawbrawlbd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import br.com.brawbrawlbd.model.Partida;

@RepositoryRestResource(collectionResourceRel="partida",path="partida")
public interface PartidaRepository extends PagingAndSortingRepository<Partida,Integer> {

}
