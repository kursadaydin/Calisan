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
		Calisan c2 = new Calisan("Nesrin", "Ömür", new GregorianCalendar(1972, 10, 14), 1800, 1254879874, Departman.MUHASEBE);
		Calisan c3 = new Calisan("Nesrin", "Yaþar", new GregorianCalendar(1985, 8, 12), 2500, 1254879874, Departman.SANTIYE);
		Calisan c4 = new Calisan("Mustafa", "Topal", new GregorianCalendar(1976, 3, 9), 3400, 1254879874, Departman.SANTIYE);
		Calisan c5 = new Calisan("Rýza", "Özkan", new GregorianCalendar(1965, 5, 5), 1500, 1254879874, Departman.SAHA);
		Calisan c6 = new Calisan("Nuri", "Ayhan", new GregorianCalendar(1985, 4, 3), 1250, 1254879874, Departman.SAHA);
		Calisan c7 = new Calisan("Aslý", "Kaya", new GregorianCalendar(1990, 6, 25), 2500, 1254879874, Departman.SAHA);
		Calisan c8 = new Calisan("Ahmet", "Aydýn", new GregorianCalendar(1992, 8, 30), 1800, 1254879874, Departman.GUVENLIK);
		Calisan c9 = new Calisan("Nurhan", "Yýlmaz", new GregorianCalendar(1973, 12, 18), 4500, 1254879874, Departman.MUHASEBE);
		Calisan c10 = new Calisan("Mediha", "Demir", new GregorianCalendar(1965, 9, 24), 2850, 1254879874, Departman.MUHASEBE);
		
			List<Calisan> listeCalisan = new ArrayList<Calisan>();
			listeCalisan.add(c1); listeCalisan.add(c2);listeCalisan.add(c3);listeCalisan.add(c4);listeCalisan.add(c5);
			listeCalisan.add(c6);listeCalisan.add(c7);listeCalisan.add(c8);listeCalisan.add(c9);listeCalisan.add(c10);
			
			//Date tarih1 = new Date(c1.getDogumTarihiCalisan().getActualMinimum(arg0), arg1, arg2)
			
		// Ortalama Maaþý bulmak......	
			
		double maasToplam=0;
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			maasToplam += listeCalisan.get(i).getMaasCalisan();
			
		}
		
		double ortalamaMaas = maasToplam/listeCalisan.size();
		
		
		System.out.println("Aylýk ücretlilerin maaþlarýnýn ortalamasý " + ortalamaMaas + "TL olarak hesaplanmýþtýr.");
		System.out.println("----------------------------------");
		
		//Maaþý En yüksek çalýþaný bulmak
		
		double tempMaas =0;
		
		for(int i =0; i < listeCalisan.size();  i++){
			
			if (listeCalisan.get(i).getMaasCalisan()>tempMaas) {
				
				tempMaas=listeCalisan.get(i).getMaasCalisan();
				
			}
		
	}
		
		System.out.println("En yüksek maaþ alan kiþinin maaþý :" + tempMaas + "TL'dir.");
		System.out.println("----------------------------------");
		
	// Muhasebe departmanýnda bulunan çalýþsanlarýn toplamýný bulmak
		double maasToplamMuhasebe=0;
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			if (listeCalisan.get(i).getDepartmanCalisan()== Departman.MUHASEBE) {
				
				maasToplamMuhasebe+= listeCalisan.get(i).getMaasCalisan();
				
			}
			
		}
		
		System.out.println("Muhasebe departmanýnda çalýþanlarýn toplam maaþlarý aylýk  :" + maasToplamMuhasebe + "TL'dir.");
		
		// Comparator kullanarak doðum tarihine göre sýralama;
		System.out.println("----------------------------------");
		System.out.println("Doðum Tarihine Göre Büyükten Küçüðe Göre Sýralanmýþ Çalýþan Listesi");
		Collections.sort(listeCalisan, new DogumTarihinegore());
		
		for (int i = 0; i < listeCalisan.size(); i++) {
			
			System.out.println(listeCalisan.get(i).getAdCalisan() + " " + listeCalisan.get(i).getSoyadCalisan() );
			
			
		}
		
		// Eðer verilerimizi sýrasýz olarak saklayacaksak "SET"	interface'ini kullanmak  performans açýsýndan daha doðru olur.
		//   Ancak "SET" yapýsýný kullanmanýn da bazý dezavantajlarý vardýr. Örneðin ayný deðere sahip birden fazla nesne saklayamýyoruz.
		System.out.println("--------------------------------------");
		System.out.println("HashNext yapýsýna göre ");
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
