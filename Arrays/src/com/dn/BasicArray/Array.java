package com.dn.BasicArray;

public class Array
{
	public static void main(String[] args)
	{
		int[]a=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		for(int n:a)
		{
			System.out.println(n);
		}
		System.out.println(a.length);
		int b[];
		b=a;
		System.out.println(b[0]);
		a[0]=80;
		System.out.println(b[0]);
	}

}
