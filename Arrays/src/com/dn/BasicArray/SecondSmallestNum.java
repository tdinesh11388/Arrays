package com.dn.BasicArray;

public class SecondSmallestNum {

	public static void main(String[] args)
	{
		int[]a= {2,4,5,6,7,8,9,4};
		int s1=9;
		int s2=9;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s1)
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2)
			{
				s2=a[i];
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
