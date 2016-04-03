package com.catalogue.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogueDaoImpl implements ICatalogueDao{

	private Map<String, Produit> produits = new HashMap<String, Produit>();
	
	@Override
	public void addProduit(Produit p) {
		produits.put(p.getReference(), p);
	}

	@Override
	public List<Produit> getAllProduit() {
		Collection<Produit> prods = produits.values();
		return new ArrayList<Produit>(prods);
	}

	@Override
	public List<Produit> getProduitsParMc(String mc) {
		List<Produit> prods = new ArrayList<Produit>();
		for(Produit p:produits.values())
			if(p.getDesignation().indexOf(mc)>=0)
				prods.add(p);
		return prods;
	}

	@Override
	public Produit getProdui(String ref) {
		return produits.get(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		produits.remove(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);
	}
	
	public void init(){
		System.out.println("Initialization de INIT");
		addProduit(new Produit("Acer","Ordinateur Acer",6000,12));
		addProduit(new Produit("HP","Ordinateur HP",8000,02));
		addProduit(new Produit("Smart","Telephone smart",2500,8));
	}

}
