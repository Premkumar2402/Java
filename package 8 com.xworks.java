package com.xworks.data;

public class MarketData 
{

	private String name;
	private String location;
	
	public MarketData(String name, String location)
	{
		this.name = name;
		this.location = location;
	}
	
	public void family()
	{
		System.out.println("Name:"+this.name);
		System.out.println("LOcation:"+this.location);
		
		
	}
}