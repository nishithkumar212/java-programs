package myjavaprograms;
public class stack 
{
	int[] stacks=new int[5];
	int top=-1;
public void push(int ele)
{
	
	if(isfull1())
	{
	System.out.println("stack is full");	
	}
	else
	{
		top++;
		stacks[top]=ele;
		System.out.println("element inserted");
	}
}
	public boolean isfull1()
	{
		if(top==stacks.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int pop()
	{
		if(isempty())
		{
			System.out.println("stack underflow");
		}
		else
		{
			int a=stacks[top--]; 
            return a; 
		}
		return top;
	}
public boolean isempty()
{
	if(stacks[top]<0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args)
	{
		stack s =new stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		int k=s.pop();
		System.out.println(k);
	}
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
















