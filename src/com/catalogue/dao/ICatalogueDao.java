package com.catalogue.dao;

import java.util.List;

public interface ICatalogueDao {

	public void addProduit(Produit p);
	public List<Produit> getAllProduit();
	public List<Produit> getProduitsParMc(String mc);
	public Produit getProdui(String ref);
	public void deleteProduit(String ref);
	public void updateProduit(Produit p);
	
	
}
