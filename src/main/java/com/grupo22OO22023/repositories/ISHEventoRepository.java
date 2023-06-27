package com.grupo22OO22023.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo22OO22023.entities.SHEvento;


@Repository("shEventoRepository")
public interface ISHEventoRepository extends JpaRepository<SHEvento, Serializable> {

	public abstract SHEvento findByIdEvento(int idEvento);

}