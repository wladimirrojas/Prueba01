package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Tazon;
import com.generation.services.TazonService;

@Controller
@RequestMapping("/registrar")
public class TazonController {

	@Autowired
	TazonService tazonService;

	@RequestMapping("")
	public String registrar(@ModelAttribute("tazon") Tazon tazon) {
		return "registrarTazon.jsp";
	}

	@PostMapping("/tazon")
	public String registrarTazon(@Valid @ModelAttribute("tazon") Tazon tazon, BindingResult resultado, Model model) {

		if (resultado.hasErrors()) {
			model.addAttribute("mensaje", "Hay datos incorrectos, por favor intente nuevamente");
			return "registrarTazon.jsp";
		} else {
			tazonService.saveTazon(tazon);
			List<Tazon> listaTazones = tazonService.findAll();
			model.addAttribute("tazonesCapturados", listaTazones);
			return "mostrarTazones.jsp";
		}

	}
	
	@RequestMapping("mostrar")
	public String mostrar(Model model) {
		List<Tazon> listaTazones = tazonService.findAll();
		model.addAttribute("tazonesCapturados", listaTazones);
		return "mostrarTazones.jsp";
	}
}


