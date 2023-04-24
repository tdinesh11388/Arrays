package com.dn.BasicArray;

public class SmallestNumInArray {

	public static void main(String[] args)
	{
		int[]a= {8,4,5,9,3,2,6,7,1};
		int s1=9;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s1)s1=a[i];
		}
		System.out.println(s1);
	}

}
