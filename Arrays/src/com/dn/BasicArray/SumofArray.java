package com.dn.BasicArray;

public class SumofArray {

	public static void main(String[] args)
	{
		int []a= {2,3,4,5,7,8,9};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
	}

}
