package com.grupo22OO22023.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo22OO22023.entities.SensorHumedad;

public interface ISensorHumedadRepository extends JpaRepository<SensorHumedad, Serializable> {
	
	public abstract SensorHumedad  findById(int id);

}