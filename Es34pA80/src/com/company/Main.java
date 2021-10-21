package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Angolo...");
	    Angolo a1;
	    a1 = new Angolo(22,80,70);
	    Angolo a2 = new Angolo(20, 20, 15);

	    System.out.println(a1.differenzaSecondi(a2));
	    a1.visualizzaAngolo();
	    a1.aggiungiGradi(4);
	    a1.visualizzaAngolo();
	    a1.aggiungiSecondi(3600);
	    a1.visualizzaAngolo();
	    a1.aggiungiPrimi(80);
	    a1.visualizzaAngolo();
	    a1.sommaAngolo(a2);
	    a1.visualizzaAngolo();
    }
}
