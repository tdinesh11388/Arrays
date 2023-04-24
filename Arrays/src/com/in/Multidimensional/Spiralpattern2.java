package com.in.Multidimensional;

public class Spiralpattern2 {

	public static void main(String[] args)
	{
		int[][]a=spiral(5);
		
		for(int[]z:a)
		{
			for(int x:z)
			{
				System.out.print(x+"\t");
			}
			System.out.println();
		}
	}
	public static int[][] spiral(int len)
	{
		int[][]a=new int[len][len];
		
		char d='r';
		int r=0; int c=-1;
		for(int i=1;i<=len*len;i++)
		{
			switch(d)
			{
				case 'r': a[r][++c]=i;
							if(c==len-1 || a[r][c+1]!=0)
								d='d';
							break;
				case 'd':a[++r][c]=i;
							if(r==len-1 || a[r+1][c]!=0)
								d='l';
							break;
				case 'l':a[r][--c]=i;
							if(c==0||a[r][c-1]!=0)
								d='u';
							break;
				case 'u':a[--r][c]=i;
							if(a[r-1][c]!=0)
								d='r';
			}
		}
		return a;
	}

}
