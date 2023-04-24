package com.dn.SingleDimensionArray;

public class Single2 {

	public static void main(String[] args) {
		int []a= {2,5,1,9,6};
		int big=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
		}
		System.out.println(big);
	}

}
