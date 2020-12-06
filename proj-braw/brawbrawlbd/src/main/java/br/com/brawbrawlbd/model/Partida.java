package br.com.brawbrawlbd.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data 
@Entity @Table(name="partida")
public class Partida {
	
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String Stage;
	private Date date;
	
	

}
