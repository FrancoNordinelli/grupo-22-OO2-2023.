package com.grupo22OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo22OO22023.helpers.ViewRouteHelper;
import com.grupo22OO22023.services.ISPEventoService;

@Controller
@RequestMapping("/evento")
public class EventoController {
	@Autowired
	@Qualifier("SPEvento")
	private ISPEventoService eventoService;
	
	
	
	@GetMapping("/")
	public ModelAndView eventos() {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.visualizarSParkingEvento);
		mV.addObject("eventos", eventoService.findAllEventosWithDependencies());
		return mV;
	}
}
