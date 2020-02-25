package com.furkankara;

public class Musteri {
	
	private Siparis siparis;

	public Musteri() {
		System.out.println("Musteri sinifinin bos parametreli yapilandiricisi");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	
	public void hesabiOde() {
		System.out.println("Musteri sinifindaki hesabiOde metodu");
		siparis.toplamSonucuAl();
	}
	
	
	
}
