package com.dn.SingleDimensionArray;

public class Single {

	public static void main(String[] args)
	{
		int[]a=new int[4];
		a[0]=10;
		a[3]=28;
		a[1]=90;
		a[2]=45;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);
	}

}
