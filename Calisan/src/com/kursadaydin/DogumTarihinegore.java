package com.kursadaydin;

import java.util.Comparator;

public class DogumTarihinegore implements Comparator<Calisan> {

	@Override
	public int compare(Calisan arg1, Calisan arg2) {
		
		if (arg1.getDogumTarihiCalisan().after(arg2.getDogumTarihiCalisan())) 
		{
			
			return 1;
		} 
		else if (arg1.getDogumTarihiCalisan().before(arg2.getDogumTarihiCalisan())) 
		{

			return -1; 
		}
		
		return 0;
	}

}
