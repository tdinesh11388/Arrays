package com.dn.Arrays;

import java.util.Arrays;
import java.util.Comparator;

class LenCompare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		return ((String)o1).length()-((String)o2).length();
	}
	
}
public class Demo2 {

	public static void main(String[] args)
	{
		String[]a= {"java","html","sql","angular"};
		Arrays.sort(a);
		for(String s:a)
		{
			System.out.println(s);
		}
	}

}
