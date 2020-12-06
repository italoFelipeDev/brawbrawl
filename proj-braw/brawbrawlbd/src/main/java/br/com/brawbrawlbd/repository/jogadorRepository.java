package br.com.brawbrawlbd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.brawbrawlbd.model.Jogador;


@RepositoryRestResource(collectionResourceRel="jogador",path="jogador")
public interface jogadorRepository extends PagingAndSortingRepository<Jogador,Integer> {

}
