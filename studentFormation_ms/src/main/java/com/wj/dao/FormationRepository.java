package com.wj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wj.dao.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long>{

}
