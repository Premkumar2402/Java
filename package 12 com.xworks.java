package com.xworks.data;

public class premStore 
{
	premData[] info = new premData[5];
	int counts;
	
	public void save(premData data)
	{
		this.info[this.counts]=data;
		counts++;
		
	}
	
	public void display()
	{
		for(premData data:info)
		{
			if(data!=null)
			{
				data.torsu();
			}
			else
			{
				System.out.println("null data");
			}
		}
	}

}