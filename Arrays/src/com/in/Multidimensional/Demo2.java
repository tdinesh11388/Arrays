package com.in.Multidimensional;

public class Demo2 {

	public static void main(String[] args)
	{
		int sum=0;
		int[][]a= {{1,0,3},{2,5,6},{7,2,4}};
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<len;j++)
			{
				if((i+j)==a.length-1 || i==j)
				{
					sum+=a[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}
