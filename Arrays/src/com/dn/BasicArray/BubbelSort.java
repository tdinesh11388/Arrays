package com.dn.BasicArray;

public class BubbelSort {

	public static void main(String[] args)
	{
		int[]a= {3,8,4,7,2,9,1,5};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int z:a)
		{
			System.out.println(z);
		}
	}

}
