package com.dn.BasicArray;

public class BobbleSort {

	public static void main(String[] args)
	{
		int[]a= {9,4,5,6,3,4,2,7,8,1,26,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int z:a)
		{
			System.out.println(z);
		}
	}

}
