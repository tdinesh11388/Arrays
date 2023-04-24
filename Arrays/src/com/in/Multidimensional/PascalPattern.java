package com.in.Multidimensional;

public class PascalPattern {

	public static void main(String[] args)
	{
		int[][]a=pascal(6);
		int space=4;
		for(int []x:a)
		{
			for(int i=0;i<=space;i++)
			{
				System.out.print(" ");
			}
			for(int z:x)
			{
				System.out.print(z+" ");
			}
			System.out.println();
			space--;
		}
	}
	public static int[][] pascal(int size)
	{
		int[][]a=new int[size][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||i==j)
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
