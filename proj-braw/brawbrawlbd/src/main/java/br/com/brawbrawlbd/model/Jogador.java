package br.com.brawbrawlbd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity @Table(name="jogador")
public class Jogador {
	
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String nick;
	private int win;
	private int dmgD;
	private int dmgT;
	private String img;
	private int match;
	private int rank;
	private String main;

}
