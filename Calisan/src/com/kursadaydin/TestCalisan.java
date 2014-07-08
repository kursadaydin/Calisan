package com.kursadaydin;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestCalisan {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calisan c1 = new Calisan("Ahmet", "Topal", new GregorianCalendar(1980, 2, 25), 3500, 1254879874, Departman.GUVENLIK);
		Calisan c2 = new Calisan("Nesrin", "�m�r", new GregorianCalendar(1972, 10, 14), 1800, 1254879874, Departman.MUHASEBE);
		Calisan c3 = new Calisan("Nesrin", "Ya�ar", new GregorianCalendar(1985, 8, 12), 2500, 1254879874, Departman.SANTIYE);
		Calisan c4 = new Calisan("Mustafa", "Topal", new GregorianCalendar(1976, 3, 9), 3400, 1254879874, Departman.SANTIYE);
		Calisan c5 = new Calisan("R�za", "�zkan", new GregorianCalendar(1965, 5, 5), 1500, 1254879874, Departman.SAHA);
		Calisan c6 = new Calisan("Nuri", "Ayhan", new GregorianCalendar(1985, 4, 3), 1250, 1254879874, Departman.SAHA);
		Calisan c7 = new Calisan("Asl�", "Kaya", new GregorianCalendar(1990, 6, 25), 2500, 1254879874, Departman.SAHA);
		Calisan c8 = new Calisan("Ahmet", "Ayd�n", new GregorianCalendar(1992, 8, 30), 1800, 1254879874, Departman.GUVENLIK);
		Calisan c9 = new Calisan("Nurhan", "Y�lmaz", new GregorianCalendar(1973, 12, 18), 4500, 1254879874, Departman.MUHASEBE);
		Calisan c10 = new Calisan("Mediha", "Demir", new GregorianCalendar(1965, 9, 24), 2850, 1254879874, Departman.MUHASEBE);
		
			List<Calisan> listeCalisan = new ArrayList<Calisan>();
			listeCalisan.add(c1); listeCalisan.add(c2);listeCalisan.add(c3);listeCalisan.add(c4);listeCalisan.add(c5);
			listeCalisan.add(c6);listeCalisan.add(c7);listeCalisan.add(c8);listeCalisan.add(c9);listeCalisan.add(c10);
			
			//Date tarih1 = new Date(c1.getDogumTarihiCalisan().getActualMinimum(arg0), arg1, arg2)
			
		// Ortalama Maa�� bulmak......	
			
		double maasToplam=0;
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			maasToplam += listeCalisan.get(i).getMaasCalisan();
			
		}
		
		double ortalamaMaas = maasToplam/listeCalisan.size();
		
		
		System.out.println("Ayl�k �cretlilerin maa�lar�n�n ortalamas� " + ortalamaMaas + "TL olarak hesaplanm��t�r.");
		System.out.println("----------------------------------");
		
		//Maa�� En y�ksek �al��an� bulmak
		
		double tempMaas =0;
		
		for(int i =0; i < listeCalisan.size();  i++){
			
			if (listeCalisan.get(i).getMaasCalisan()>tempMaas) {
				
				tempMaas=listeCalisan.get(i).getMaasCalisan();
				
			}
		
	}
		
		System.out.println("En y�ksek maa� alan ki�inin maa�� :" + tempMaas + "TL'dir.");
		System.out.println("----------------------------------");
		
	// Muhasebe departman�nda bulunan �al��sanlar�n toplam�n� bulmak
		double maasToplamMuhasebe=0;
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			if (listeCalisan.get(i).getDepartmanCalisan()== Departman.MUHASEBE) {
				
				maasToplamMuhasebe+= listeCalisan.get(i).getMaasCalisan();
				
			}
			
		}
		
		System.out.println("Muhasebe departman�nda �al��anlar�n toplam maa�lar� ayl�k  :" + maasToplamMuhasebe + "TL'dir.");
		
		// Comparator kullanarak do�um tarihine g�re s�ralama;
		System.out.println("----------------------------------");
		System.out.println("Do�um Tarihine G�re B�y�kten K����e G�re S�ralanm�� �al��an Listesi");
		Collections.sort(listeCalisan, new DogumTarihinegore());
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			System.out.println(listeCalisan.get(i).getAdCalisan() + " " + listeCalisan.get(i).getSoyadCalisan() );
			
			
		}
		
		// E�er verilerimizi s�ras�z olarak saklayacaksak "SET"	interface'ini kullanmak  performans a��s�ndan daha do�ru olur.
		//   Ancak "SET" yap�s�n� kullanman�n da baz� dezavantajlar� vard�r. �rne�in ayn� de�ere sahip birden fazla nesne saklayam�yoruz.
		System.out.println("--------------------------------------");
		System.out.println("HashNext yap�s�na g�re ");
		System.out.println("--------------------------------------");
		Set<Calisan> calisanListeHashSet = new HashSet<Calisan>();
		calisanListeHashSet.addAll(listeCalisan);
		
		Iterator<Calisan> it = calisanListeHashSet.iterator();
		
		while (it.hasNext()) {
			Calisan temp = (Calisan) it.next();
			System.out.println(temp.getAdCalisan() +" " + temp.getSoyadCalisan() );
			
			
		}
		
		}
	
}
