package com.xworkz.game;

public class Submarine {

	private String name;
	private String country;
	private int marineNo;
	private int countryCode;
	private double price;
	private String color;
	private int weight;
	private int height;
	private double width;
	private int modelNo;
	private char size;
	private String mnfgBy;
	private String capitanName;
	private int capitanAge;
	private long capitanMobileNo;
	private String subCapitanName;
	private int subCapitanAge;
	private long subCapitanMobileNo;
	private int capacity;
	private String owner;
	private String mnfgCompany;
	private String material;
	private boolean available;
	private boolean quality;
	private int noOfmembersInMarine;//25
	private String type;
	private String industry;
	private String inventor; 
	private String invented;
	private String forceName;
	private int forceId;
	private String nationality;
	private String mnfgCountry;
	private String mnfgDate;
	private int noOfCaption;
	private int capitanSal;
	private int workExp;
	private String capitanAddress;
	private String  serviceManName;
	private int serviceManSal;
	
	
	public Submarine(String name, String country, int marineNo, int countryCode, double price, String color)
	{
		this.name=name;
		this.country=country;
		this.marineNo=marineNo;
		this.countryCode=countryCode;
		this.price=price;
		this.color=color;
	}
	
	public void open(int weight, int height, double width, int modelNo, char size, String mnfgBy, String capitanName, int capitanAge, long capitanMobileNo, int capacity, String owner, String mnfgCompany, String material, boolean available, boolean quality, int noOfMembersInMarine, String type, String industry, String inventor, String invented, String forceName, int forceId, String nationality, String mnfgCountry, String mnfgDate, int noOfCaption, int capitanSal, int workExp, String capitanAddress, String  serviceManName, int serviceManSal)
	{
		System.out.println("Name :"+this.name);
		System.out.println("Country :"+this.country);
		System.out.println("Marine No :"+this.marineNo);
		System.out.println("Country Code :"+this.countryCode);
		System.out.println("Price :"+this.price);
		System.out.println("Color :"+this.color);
		System.out.println("Weight :"+weight);
		System.out.println("Height :"+height);
		System.out.println("Width :"+width);
		System.out.println("Model No:"+modelNo);
		System.out.println("Size :"+size);
		System.out.println("Mnfg By :"+mnfgBy);
		System.out.println("Capitan Name :"+capitanName);
		System.out.println("Capitan Age :"+capitanAge);
		System.out.println("Capitan Mobile No :"+capitanMobileNo);
		System.out.println("Capacity :"+capacity);
		System.out.println("Owner :"+owner);
		System.out.println("Mnfg Company :"+mnfgCompany);
		System.out.println("Material :"+material);
		System.out.println("Available :"+available);
		System.out.println("Quality :"+quality);
		System.out.println("No Of Membs In Marine :"+noOfMembersInMarine);
		System.out.println("Type :"+type);
		System.out.println("Industry:"+industry);
		System.out.println("Inventor:"+inventor);
		System.out.println("Invented :"+invented);
		System.out.println("Force Name :"+forceName);
		System.out.println("Force Id:"+forceId);
		System.out.println("Nationality :"+nationality);
		System.out.println("Mnfg Country :"+mnfgCountry);
		System.out.println("Mnfg Date :"+mnfgDate);
		System.out.println("No Of Caption :"+noOfCaption);
		System.out.println("Caption Salary :"+capitanSal);
		System.out.println("Work Experience :"+workExp);
		System.out.println("Capitan Address :"+capitanAddress);
		System.out.println("Service Man Name :"+serviceManName);
		System.out.println("Service Man Salary :"+serviceManSal);
		
	}
}