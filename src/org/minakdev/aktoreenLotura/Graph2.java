package org.minakdev.aktoreenLotura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.minakdev.aktoreak.AktoreZerrenda;

public class Graph2 {
	HashMap<String, Integer> th;
	String[] keys;
	ArrayList<Integer>[] adjList;
	
	public void grafoaSortu(AktoreZerrenda lAktoreak) {
		// Post: aktoreen zerrendatik grafoa sortzen du
		//       Adabegiak aktoreen izenak eta pelikulen izenburuak dira 
		
		// 1. pausoa: â€œthâ€� bete
		// KODEA OSATU
		
		// 2. pausoa: â€œkeysâ€� bete
		keys = new String[th.size()];
		for (String k: th.keySet()) keys[th.get(k)] = k;
		
		// 3. pausoa: â€œadjListâ€� bete
		// KODEA OSATU
	}
	
	public void print(){
		for (int i = 0; i < adjList.length; i++){
			System.out.print("Element: " + i + " " + keys[i] + " --> ");
			for (int k: adjList[i])  System.out.print(keys[k] + " ### ");
				System.out.println();
		}
	}
		
	public boolean konektatuta(String a1, String a2){
		Queue<Integer> aztertuGabeak = new LinkedList<Integer>();
	
		int pos1 = th.get(a1);
		int pos2 = th.get(a2);
		boolean aurkitua = false;
		boolean[] aztertuak = new boolean[th.size()];
	
		// KODEA OSATU
	
		return aurkitua;
	}
}
