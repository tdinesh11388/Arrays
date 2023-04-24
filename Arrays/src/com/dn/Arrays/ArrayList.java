package com.dn.Arrays;


class Demo
{
		Object []a=new Object[3];
		private int p=0;
		public  void add(Object e)
		{
			if(p>=a.length)
			{
				Object[] temp=new Object[a.length+3/2];
				for(int i=0;i<a.length;i++)
				{
					temp[i]=a[i];
				}
				a=temp;
			}
			a[p]=e;
			p++;
		}
		public int size()
		{
			return p;
		}
		public Object get(int index)
		{
			if(index<=-1 || index>=size())
			{
				throw new IndexOutOfBoundsException();
			}
			return a[index];
		}
		public void remove(int index)
		{
			if(index<=-1 || index>=size())
			{
				throw new IndexOutOfBoundsException();
			}
			for(int i=index+1;i<size();i++)
			{
				a[i-1]=a[i];
			}
			p--;
			a[p]=null;
		}
		public void add(int index,Object e)
		{
			if(index<=-1 || index>=size())
			{
				throw new IndexOutOfBoundsException();
			}
			for(int i=size()-1;i>=0;i--)
			{
				a[i+1]=a[i];
			}
			a[index]=e;
			p++;
		}
}
public class ArrayList
{
	public static void main(String []args)
	{
			Demo a=new Demo();
			a.add(10);
			a.add(20);
			a.add(30);
			a.add(40);
			a.add(2,45);
			
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
	}
}

