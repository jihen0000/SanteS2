package com.bri.santeS2.services;

import com.bri.santeS2.entities.InformationSup;

public interface InformationSupService {
	public long addInformationSup(InformationSup informationSup, long idDocument);
	public void updateInformationSup(InformationSup informationSup);
	public InformationSup getInformationSup(long idDocument);

}
