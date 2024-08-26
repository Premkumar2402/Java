package com.xworks.data;

public class MarketStore 
{
	private MarketData[] datas=new MarketData[5];
private 	int index;
	
	public void save(MarketData data)
	{
		this.datas[this.index]=data;
		this.index++;
	}
	
	public void family()
	{
		for(MarketData data:datas)
		{
			if(data!=null)
			{
				data.show();
			}
			else
			{
				System.out.println("null data");
			}
		}
	}

}