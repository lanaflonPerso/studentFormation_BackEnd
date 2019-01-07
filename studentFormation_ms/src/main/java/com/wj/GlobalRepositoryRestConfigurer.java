package com.wj;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.wj.dao.entities.Formation;
import com.wj.dao.entities.Student;

@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
		
		
		//Si on veut que l'api Rest me retourne l'étudiant qui a été ajouté
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		
		/*
		 * On est entrain de lui dire que quand il va convertir un étudiant
		 * en format json,  dans le format json, tu vas exposer l'id
		 */
		repositoryRestConfiguration.exposeIdsFor(Student.class, Formation.class);
		
		/*
		 * addMapping("/**"): Il accepte n'importe quel url, requête
		 * qui provient du http://localhost:4200. 
		 * allowedOrigins("http://localhost:4200") : definis le domaine.
		 * allowedOrigins("*"): Il accepte tous les domaines
		 * allowedHeaders("*") : On autorise toutes les entêtes qui proviennent 
		 * des reqûetes http
		 */
		repositoryRestConfiguration.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("*")
		.allowedHeaders("*")
		.allowedMethods("OPTIONS", "HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
	}

}
