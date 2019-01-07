package com.wj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wj.dao.entities.Student;

/*
 * Pour exposer un interface repository sous forme d'un webservice
 * on utilise spring Data Rest, l'annotation RepositoryRestResource
 * On dit à Spring; que toutes les méthodes qui se trouve dans cette 
 * interface, qu'on a herité de JpaRepository; je voudrais qu'elle 
 * soit accessible via une api Rest. 
 * Spring Data rest sait qu'on gère des entités student.
 * L'url est le pluriel de l'entité qu'on spécifie dans JpaRepository
 * donc aura http://localhost:8080/students.
 */

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//@Query("select e from Etudiant e where e.nom like :x")
	public List<Student> findByNomContains(/*@Param("x")*/String nom);
	
}
