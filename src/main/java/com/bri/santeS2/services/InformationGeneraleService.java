package com.bri.santeS2.services;

import com.bri.santeS2.entities.InformationGenerale;

public interface InformationGeneraleService {
	public long addInfoGenerale(InformationGenerale informationGenerale, long idDocument);
	public void updateInfoGenerale(InformationGenerale informationGenerale);
	public InformationGenerale getInfoGenerale(long idDocument);

}
