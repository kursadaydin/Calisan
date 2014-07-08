package com.kursadaydin;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calisan {
	
	private String adCalisan;
	private String soyadCalisan;
	private Calendar dogumTarihiCalisan;
	private double maasCalisan;
	private double tcNoCalisan;
	private Departman departmanCalisan;
	
	
	
	public Calisan(String adCalisan, String soyadCalisan,
			Calendar dogumTarihiCalisan, double maasCalisan,
			double tcNoCalisan, Departman departmanCalisan) {
		super();
		this.adCalisan = adCalisan;
		this.soyadCalisan = soyadCalisan;
		this.dogumTarihiCalisan = dogumTarihiCalisan;
		this.maasCalisan = maasCalisan;
		this.tcNoCalisan = tcNoCalisan;
		this.departmanCalisan = departmanCalisan;
	}



	public String getAdCalisan() {
		return adCalisan;
	}



	public void setAdCalisan(String adCalisan) {
		this.adCalisan = adCalisan;
	}



	public String getSoyadCalisan() {
		return soyadCalisan;
	}



	public void setSoyadCalisan(String soyadCalisan) {
		this.soyadCalisan = soyadCalisan;
	}



	public Calendar getDogumTarihiCalisan() {
		return dogumTarihiCalisan;
	}



	public void setDogumTarihiCalisan(Calendar dogumTarihiCalisan) {
		this.dogumTarihiCalisan = dogumTarihiCalisan;
	}



	public double getMaasCalisan() {
		return maasCalisan;
	}



	public void setMaasCalisan(double maasCalisan) {
		this.maasCalisan = maasCalisan;
	}



	public double getTcNoCalisan() {
		return tcNoCalisan;
	}



	public void setTcNoCalisan(double tcNoCalisan) {
		this.tcNoCalisan = tcNoCalisan;
	}



	public Departman getDepartmanCalisan() {
		return departmanCalisan;
	}



	public void setDepartmanCalisan(Departman departmanCalisan) {
		this.departmanCalisan = departmanCalisan;
	}



	



	
	
	
	
	
	
	
	

}
