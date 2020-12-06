package br.com.brawbrawlbd.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity @Data 
@IdClass(Jogada.class)
@Table(name="jogada")
public class Jogada implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @ManyToOne 
	private Jogador jogador;
	@Id @ManyToOne
	private Partida partida;
	private int dano;
	private int danoR;
	private int coloc;
	private Legends legend;
	

}
