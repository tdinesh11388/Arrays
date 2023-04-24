package com.in.Multidimensional;

public class Pascal {

	public static void main(String[] args)
	{
		int[][]a=pascal(10);
		for(int [] z:a)
		{
			for(int x:z)
			{
				System.out.print(x);
			}
			System.out.println();
		}
		
	}
	public static int[][] pascal(int n)
	{
		int [][]a=new int[n][];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j|| j==0)
				{
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}

}
