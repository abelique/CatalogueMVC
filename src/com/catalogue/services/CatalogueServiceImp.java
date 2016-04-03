package com.catalogue.services;

import java.util.List;

import com.catalogue.dao.ICatalogueDao;
import com.catalogue.dao.Produit;

public class CatalogueServiceImp implements ICatalogueService {

	private ICatalogueDao dao;
	
	public void setDao(ICatalogueDao dao){
		this.dao = dao;
	}
	
	@Override
	public void addProduit(Produit p) {
		dao.addProduit(p);
	}

	@Override
	public List<Produit> getAllProduit() {
		return dao.getAllProduit();
	}

	@Override
	public List<Produit> getProduitsParMc(String mc) {
		return dao.getProduitsParMc(mc);
	}

	@Override
	public Produit getProdui(String ref) {
		return dao.getProdui(ref);
	}

	@Override
	public void deleteProduit(String ref) {
		dao.deleteProduit(ref);
	}

	@Override
	public void updateProduit(Produit p) {
		dao.updateProduit(p);
	}

}
