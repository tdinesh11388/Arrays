package com.in.Multidimensional;

public class SpiralPattern {

	public static void main(String[] args)
	{
		int[][]a=pascal(5);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] pascal(int size)
	{ 
		int[][]a=new int[size][size];
		char d='r';
		int r=0;int c=-1;
		for(int i=1;i<=size*size;i++)
		{
			switch(d)
			{
			case 'r': a[r][++c]=i;
						if(c==size-1||a[r][c+1]!=0)
							d='d';
						break;
			case 'd': a[++r][c]=i;
						if(r==size-1||a[r+1][c]!=0)
							d='l';
						break;
			case 'l': a[r][--c]=i;
						if(c==0||a[r][c-1]!=0)
							d='u';
						break;
			case 'u': a[--r][c]=i;
						if(a[r-1][c]!=0)
							d='r';
			}
		}
		return a;
	}

}
