package com.bri.santeS2.services;

import com.bri.santeS2.entities.EmployeeBuvette;

public interface EmployeeBuvetteService {
	public long addEmployeeBuvette(EmployeeBuvette employeeBuvette, long idBuvette);
	public void updateEmployeeBuvette(EmployeeBuvette employeeBuvette);
	public EmployeeBuvette getEmployeeBuvette(long idEmployeeBuvette);

}
