package com.catalogue.services;

import java.util.List;

import com.catalogue.dao.Produit;

public interface ICatalogueService {
	public void addProduit(Produit p);
	public List<Produit> getAllProduit();
	public List<Produit> getProduitsParMc(String mc);
	public Produit getProdui(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
}
