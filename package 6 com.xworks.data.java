package com.xworks.data.store;

import com.xworks.data.Sandal;

public class SandalStore 
{
	private Sandal[] sandals=new Sandal[5];
 private 	int number;
	
	public void store(Sandal slippers)
	{
		this.sandals[this.number]=slippers;
		this.number++;
	}
	
	public void janu()
	{
		for(Sandal slippers:this.sandals)
		{
			if(slippers!=null)
			{
				slippers.family();
			}
			else
			{
				System.out.println("null data");
			}
		}
	}
	

}