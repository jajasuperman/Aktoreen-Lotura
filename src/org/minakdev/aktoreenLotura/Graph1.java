package org.minakdev.aktoreenLotura;

import java.util.ArrayList;
import java.util.HashMap;

import org.minakdev.aktoreak.AktoreZerrenda;

public class Graph1 {

HashMap<String, ArrayList<String>> g;
	
	public void grafoaSortu(AktoreZerrenda lAktoreak) {
		// Post: aktoreen zerrendatik grafoa sortzen du
		// Adabegiak aktoreen izenak eta pelikulen izenburuak dira 
		
		// KODEA OSATU
	}
	
	public void print(){
		int i = 1;
		for (String s: g.keySet()){
			System.out.print("Element: " + i++ + " " + s + " --> ");
			for (String k: g.get(s)){
				System.out.print(k + " ### ");
			}
			System.out.println();
		}
	}
	
	public boolean konektatuta(String a1, String a2) {
	// KODEA OSATU
		return
	}
}