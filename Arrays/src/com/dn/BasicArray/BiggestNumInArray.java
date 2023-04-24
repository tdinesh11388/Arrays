package com.dn.BasicArray;

public class BiggestNumInArray {

	public static void main(String[] args)
	{
		int[]a= {2,3,4,5,6,7,2,1,4,5};
		int big=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)big=a[i];
		}
		System.out.println(big);
	}

}
