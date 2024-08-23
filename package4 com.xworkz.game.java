package com.xworkz.game.videogame;

import com.xworkz.game.Submarine;

public class SubmarineRunner {

	public static void main(String[] args) {
		
		Submarine submarine1= new Submarine("INS Arihant (S2)", "india", 20103, 91, 500000, "green");
		
		Submarine submarine2= new Submarine("INS Arighat (S3)", "India", 31105, 91, 900000, "Black");
		
		Submarine submarine3=new Submarine("INS Vagsheer(S26)", "India", 41105, 91, 590000, "Brown");
		
		Submarine[] marine=new Submarine[3];
		
		marine[0]=submarine1;
		marine[1]=submarine2;
		marine[2]=submarine3;
		
		for(Submarine val:marine)
		{
			System.out.println(val);
			val.open(1000, 6, 5, 112453, 'M', "Naval Group", "Osama", 45, 9934512009L, 90, "In govt", "Naval Group", "Metal", true, true, 25, "Nuclear-powered attack", "arms", "cornelis drebbel", "1620 Aug", "SSGN", 3190, "INDIA", "India", "1920 Sep", 3, 100000, 8, "Bangalore", "Vijay", 50000);
		}
	}

}