package com.cc.java;

public class App {

	public static void main(String[] args) {
	
		Mitarbeiter mitarbeiter1 = new Mitarbeiter("Neumann", "Jan", "Chef", 1998);

		output(mitarbeiter1.getInfo("#Name"));
		output(mitarbeiter1.getInfo("#Vorname"));
		output(mitarbeiter1.getInfo("#Funktion"));
		output(mitarbeiter1.getInfo("#Beitrittsjahr"));

		output("--------------------------");

		Mitarbeiter mitarbeiter2 = new Mitarbeiter("Neufrau", "Julia", "Abteilungsleiterin", 2011);

		output(mitarbeiter2.getInfo("#Name"));
		output(mitarbeiter2.getInfo("#Vorname"));
		output(mitarbeiter2.getInfo("#Funktion"));
		output(mitarbeiter2.getInfo("#Beitrittsjahr"));

		output("--------------------------");

		Mitarbeiter mitarbeiter3 = new Mitarbeiter("Marli", "Max", "Buchhalter", 2013);

		output(mitarbeiter3.getInfo("#Name"));
		output(mitarbeiter3.getInfo("#Vorname"));
		output(mitarbeiter3.getInfo("#Funktion"));
		output(mitarbeiter3.getInfo("#Beitrittsjahr"));


	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
