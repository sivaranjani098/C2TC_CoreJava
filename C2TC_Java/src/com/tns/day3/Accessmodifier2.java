package com.tns.day3;

public class Accessmodifier2 {
	Accessmodifier2 ac = new Accessmodifier2();
	System.out.println("Same package but different class");
	System.out.println(ac.pubval);
	//System.out.println(ac.prival);  because private access the one class //  
	System.out.println(ac.defval);
	System.out.println(ac.proval);
	// ac.pubval(); //
	ac.priMethod();
	ac.proMethod();
	ac.defMethod();
}
