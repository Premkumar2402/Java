package com.xworkz.game.videogame;

import com.xworkz.game.Plant;

public class PlantRunner {

	public static void main(String[] args) {
		
		Plant plant1= new Plant("Daisy", 250, 2, "flower", 4);
		
		Plant plant2= new Plant("Orchid", 450, 1, "flower", 3);

		Plant plant3= new Plant("Shrubs", 650, 1, "fancy", 2);
		
		Plant[] anything= new Plant[3];
		
		anything[0]=plant1;
		anything[1]=plant2;
		anything[2]=plant3;
		
		for(Plant ref:anything)
		{
			System.out.println(ref);
			ref.kattu(2,"Lalbagh Flower garden", "Lalbagh", "2 Aug", true);
		}

	}

}