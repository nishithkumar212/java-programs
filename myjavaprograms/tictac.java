package myjavaprograms;
import bridgeit.utility;
public class tictac 
{
public static void main(String[] args) 
{
int[][] arr=new int[3][3];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr.length-1;j++)
	{
		System.out.println("enter a number");
		arr[i][j]=utility.getint();
		
		
	}
}
}
}
