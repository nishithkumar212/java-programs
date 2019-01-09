package myjavaprograms;
import java.util.ArrayList;
import java.util.Random;

import bridgeit.utility;
public class couponnumbers 
{
public static void main(String[] args)
{
	String  distinct="";
	int count=0;
System.out.println("enter the coupon number");
int coupons=utility.getint();
ArrayList al=new ArrayList();
for(int i=1;i<=coupons;i++)
{
	al.add(i);
}
Random rd=new Random();
int a=rd.nextInt(coupons);
while(a<=coupons)
{
if(al.contains(a))
{
	distinct=distinct+" "+a;  
}
a=rd.nextInt(coupons);
}
System.out.println(distinct);
}
}
