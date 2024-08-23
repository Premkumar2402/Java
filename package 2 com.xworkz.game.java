package com.xworkz.game.videogame;

import com.xworkz.game.Ball;

public class BallRunner {

	public static void main(String[] args) {

		Ball ball1= new Ball("Foot Ball", "Nivea", 1132, 'M', 2001, 2.5, "White");
		
		Ball ball2= new Ball("Basket Ball", "Adidas", 1121, 'S', 4001, 2.0, "orange");
		
		Ball ball3= new Ball("Volley Ball", "Puma", 122, 'M', 2012, 3.5, "Yellow");
		
		Ball[] whatever=new Ball[3];
		
		whatever[0]=ball1;
		whatever[1]=ball2;
		whatever[2]=ball3;
		
		for(Ball value:whatever)
		{
			System.out.println(value);
			value.auchi("Leather", 2, 2000, "Online", "Indian Sports", "Dharmapuri", 63670, 9952677546L, "02 Aug", 1001, true, 5, "Osama", "Azees", "01 Jan", "USA", 9965411645L, "Haji");
		}


		
	}

}