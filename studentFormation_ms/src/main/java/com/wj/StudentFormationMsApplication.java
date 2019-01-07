package com.wj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.wj.dao.FormationRepository;
import com.wj.dao.StudentRepository;
import com.wj.dao.entities.Formation;
import com.wj.dao.entities.Student;

@SpringBootApplication
public class StudentFormationMsApplication implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentFormationMsApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {	
		
	/*
		Formation f1 = formationRepository.save(new Formation(null, "PHP", 30, null));
		Formation f2 = formationRepository.save(new Formation(null, "JAVA", 30, null));
		Formation f3 = formationRepository.save(new Formation(null, "oracle", 30, null));		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		studentRepository.save(new Student(null, "JUSTE", "Louis", df.parse("13/02/2013"), f1));
		studentRepository.save(new Student(null, "SALANSON", "Flora", df.parse("06/03/1994"), f1));
		studentRepository.save(new Student(null, "JUSTE", "Mathéo", df.parse("07/02/2013"), f2));
		studentRepository.save(new Student(null, "TRUJILLO", "Aurore", df.parse("02/10/1988"), f3));
		*/
	}


}

