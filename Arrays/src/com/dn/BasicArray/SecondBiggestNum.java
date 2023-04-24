package com.dn.BasicArray;

public class SecondBiggestNum {

	public static void main(String[] args)
	{
		int[]a= {2,5,6,7,3,1,7,3,2,8,9,4};
		int b1=0;
		int b2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b1)
			{
				b2=b1;
				b1=a[i];
			}
			else if(a[i]>b2)
			{
				b2=a[i];
			}
		}
		System.out.println(b1);
		System.out.println(b2);
	}

}
