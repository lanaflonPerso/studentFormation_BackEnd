package com.wj.dao.entities;

import org.springframework.data.rest.core.config.Projection;

import com.wj.dao.entities.Student;

/*
 * Ici la projection s'applique pour l'entité Etudiant et s'appelle p1
 * Ici la projection va retourner, le nom et sa formation
 */
@Projection(name="p1", types= {Student.class})
public interface EtudiantProjection {
	
	public String getNom();
	public Formation getFormation();
	
}
