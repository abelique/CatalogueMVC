package com.catalogue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.catalogue.dao.Produit;
import com.catalogue.services.ICatalogueService;

@Controller
public class CatalogueController {

	@Autowired
	private ICatalogueService service;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", service.getAllProduit());
		return "produits";
	}
	
	
}
