package com.dn.BasicArray;

public class LinearSearchANumItsExitOrNot {

	static int linearSearch(int[]a,int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)return a[i];
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[]a= {10,20,35,60,50,40};
		int k=21;
		System.out.println(linearSearch(a,k));
	}

}
