package com.dn.Arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args)
	{
		Student []s=new Student[4];
		s[0]=new Student("dinesh",80);
		s[1]=new Student("john",78);
		s[2]=new Student("ram",90);
		
		Arrays.sort(s);
		
		for(Student s1:s)
		{
			System.out.println(s1);
		}
	}

}
