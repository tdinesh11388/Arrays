package com.dn.Sort;

public class BobbleSort {

	public static void main(String[] args)
	{
		int[]a=new int[8];
		a[0]=6;
		a[1]=8;
		a[2]=4;
		a[3]=1;
		a[4]=5;
		a[5]=3;
		a[6]=9;
		a[7]=2; 
		sort(a);
		for(int s:a)
		{
			System.out.println(s);
		}
	}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length;i++)
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
		
	}

}
