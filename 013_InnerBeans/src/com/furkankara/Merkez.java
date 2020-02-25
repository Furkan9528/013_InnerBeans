package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		// Parametrede sinif adi
		Musteri musteri = context.getBean("beanMusteri",Musteri.class);
		
		musteri.hesabiOde();
		
		
		
	}

}
