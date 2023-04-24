package com.dn.Arrays;

import java.util.Arrays;

class Circle implements Comparable
{
	int radius;
	
	Circle(int r)
	{
		radius=r;
	}
	@Override
	public int compareTo(Object o)
	{
		return radius-((Circle)o).radius;
	}
	public String toString()
	{
		return "Circle[ radisu = "+radius+"]";
	}

}
public class Test {

	public static void main(String[] args)
	{
		Circle[] c=new Circle[3];
		c[0]=new Circle(10);
		c[1]=new Circle(40);
		c[2]=new Circle(30);
		
		Arrays.sort(c);
		
		for(Circle a:c)
		{
			System.out.println(a);
		}
	}

}
