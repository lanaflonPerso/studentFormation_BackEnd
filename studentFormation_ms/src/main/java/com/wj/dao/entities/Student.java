package com.wj.dao.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Creation d'une entité JPA
 */

@Entity //La classe correspond à une table, elle est persistente
@Data @AllArgsConstructor @NoArgsConstructor
public class Student {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="FORMATION_ID")  //clé etrangère
	private Formation formation;
	

}
