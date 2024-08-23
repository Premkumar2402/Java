package com.xworkz.game;

public class Ball {
	
	private String name;
	private String brand;
	private int brandId;
	private char size;
	private int modelNo;
	private double weight;
	private String color;
	private String material;
	private int quantity;
	private double price;
	private String paymentType;
	private String shop;
	private String location;
	private int pincode;
	private long phoneNo;
	private String purchseDate;
	private int billNo;
	private boolean quality;
	private int warranty;
	private String owner;
	private String seller;
	private String manfDate;
	private String manfCity;
	private long custMobileNo;
	private String custName;
	
	
	public Ball(String name, String brand, int brandId, char size, int modelNo, double weight, String color)
	{
		this.name=name;
		this.brand=brand;
		this.brandId=brandId;
		this.size=size;
		this.modelNo=modelNo;
		this.weight=weight;
		this.color=color;
	}
	
	public void auchi(String material, int quantity, double price, String paymentType, String shop, String location, int pincode, long phoneNo, String purchaseDate, int billNo, boolean quality, int warranty, String owner, String seller, String manfDate, String manfCity, long custMobileNo, String custName)
	{
		System.out.println("Name :"+this.name);
		System.out.println("Brand :"+this.brand);
		System.out.println("Brand Id :"+ this.brandId);
		System.out.println("Size :"+this.size);
		System.out.println("Model No :"+this.modelNo);
		System.out.println("Weight :"+this.weight);
		System.out.println("Color :"+this.color);
		System.out.println("Material :"+material);
		System.out.println("Quantity:"+quantity);
		System.out.println("Price :"+price);
		System.out.println("Payment Type :"+paymentType);
		System.out.println("Shop :"+shop);
		System.out.println("Location :"+location);
		System.out.println("Pincode :"+pincode);
		System.out.println("Phone No :"+phoneNo);
		System.out.println("Purchase Date :"+purchaseDate);
		System.out.println("Bill No :"+billNo);
		System.out.println("Quality :"+quality);
		System.out.println("Warranty :"+warranty);
		System.out.println("Owner :"+owner);
		System.out.println("Seller :"+seller);
		System.out.println("Manf Date :"+manfDate);
		System.out.println("Manf City :"+manfCity);
		System.out.println("Cust Mobile No:"+custMobileNo);
		System.out.println("Cust Name:"+custName);
	}
	
}