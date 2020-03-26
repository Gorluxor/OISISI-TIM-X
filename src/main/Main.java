package main;

import entiteti.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poljoprivrednik p1 = new Poljoprivrednik("Marko Markovic", 2);
		Firma p2 = new Firma("Poljolink", "20133");
		
		p1.dodajProizvod("grasak", 50);
		p1.dodajProizvod("repa", 100);
		
		p2.dodajProizvod("secer", 400);
		p2.dodajProizvod("repu", 100);
		
		Proizvodac[] nizProizvodjaca = {p1, p2};
		
		for (int i = 0; i < 2; i++) {
			System.out.println(nizProizvodjaca[i]);
		}
		
		System.out.println(nizProizvodjaca[0].getCena("grasak"));
		System.out.println(nizProizvodjaca[1].getCena("secer"));
		
		
	}

}
