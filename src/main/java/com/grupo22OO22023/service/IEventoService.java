package com.grupo22OO22023.service;

import java.time.LocalDateTime;
import java.util.List;

import com.grupo22OO22023.entities.Evento;
import com.grupo22OO22023.models.EventoModel;

public interface IEventoService {
	
	public EventoModel insertOrUpdate(EventoModel eventoModel);
	public boolean remove(int id);

	public List<Evento> getAll();
	
	public abstract List<Evento> findByNombreEvento(String nombreEvento);
	public abstract List<Evento> findByCreatedAt(LocalDateTime createdAt);

	public abstract List<EventoModel> findAllEventosWithAttributes();
	public abstract List<Evento> findByDispositivo(int idDispositivo);
	public abstract List<EventoModel> findByNombreEventoAndDispositivo(String nombreEvento, int idDispositivo);
	
	public abstract EventoModel findByidEvento(int idEvento);
}
