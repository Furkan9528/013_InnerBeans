package com.furkankara;

public class Siparis {

	int tutar;

	public Siparis() {
		System.out.println("Siparis sinifinin bos parametreli yapilandiricisi");
	}


	//---------------------------------------
	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	//---------------------------------------
	
	public void toplamSonucuAl() {
		System.out.println("Siparis sinifindaki toplamSonucuAl metodu");
		System.out.println("Toplam :"+ getTutar());
	}
	
	
}
