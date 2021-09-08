package com.htc.doctormanagement.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.doctormanagement.entity.Doctor;

@Repository
public interface IDoctor extends JpaRepository<Doctor,Long>{
	
}
