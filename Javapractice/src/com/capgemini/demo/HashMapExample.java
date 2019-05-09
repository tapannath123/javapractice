package com.capgemini.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		
		hm.put(1, "delhi");
		hm.put(2, "mumbai");
		hm.put(5, "dubai");
		
		System.out.println(hm);
		Set sn = hm.entrySet();
		Iterator it=sn.iterator();
		
		while(it.hasNext()) {
			
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
	}
	
}
