package datastructures;

import java.util.ArrayList;

import bridgeit.utility;

public class primenumbers
{
public static void main(String[] args)
{
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=1;i<100;i++)
{
	int count=0;
	for(int j=i;j>=1;j--)
	{
	if(i%j==0)
	{
		count=count+1;
	}
	}
	if(count==2)
	{
		al.add(i);
	}
}
Integer[] arr=al.toArray(new Integer[al.size()]);
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println(arr[i]);
}
System.out.println("enter the number of rows");
int a=utility.getint();
int b=arr.length;
int[][] twod=new int[a][b];
int x=0;
for(int j=0;j<a;j++)
{
	for(int k=0;k<b;k++)
	{
		twod[j][k]=arr[x];
		x++;
	}
}
for(int i=0;i<=a;i++)
{
	for(int j=0;j<b;j++)
	{
		System.out.print(twod[i][j]);
	}
}
}
}









