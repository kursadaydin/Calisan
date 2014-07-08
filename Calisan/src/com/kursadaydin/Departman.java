package com.kursadaydin;

public enum Departman {
	MUHASEBE(0,"Muhasebe"),
	SANTIYE(1,"�antiye"),
	SAHA(2,"Saha"),
	GUVENLIK(3,"G�venlik");
	
	private int indeksDepartman;
	private String aciklamaDepartman;
	private Departman(int indeksDepartman, String aciklamaDepartman) {
		this.indeksDepartman = indeksDepartman;
		this.aciklamaDepartman = aciklamaDepartman;
	}
	
	
	public int getIndeksDepartman() {
		return indeksDepartman;
	}
	public String getAciklamaDepartman() {
		return aciklamaDepartman;
	}
	
	

}
