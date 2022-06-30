package com.bri.santeS2.services;

import com.bri.santeS2.entities.CuisineResidant;

public interface CuisineResidantService {
	
	public long addCuisineResidant(CuisineResidant cuisineResidant, long idDocument);
	public void updateCuisineResidant(CuisineResidant cuisineResidant);
	public CuisineResidant getCuisineResidant(long idDocument);

}
