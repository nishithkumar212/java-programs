package datastructures;
public class linkedlist
{
Node head;
class Node
{
int data;
Node next;
Node(int d)
{
	this.data=d;
	this.next=null;
}
}
public void append(int a)
{
	Node new_node=new Node(a);
	if(head==null)
	{
		head=new Node(a);
		return;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
	}
}
public void push(int a)
{
	Node new_node=new Node(a);
	new_node.next=head;
	head=new_node;
}
public void show()
{
	Node node=head;
	while(node.next!=null)
	{
		System.out.println(node.data);
		node=node.next;
	}
	System.out.println(node.data);
}
public static void main(String[] args)
{
	linkedlist obj=new linkedlist();
	obj.append(12);
	obj.append(24);
obj.append(15);
obj.push(10);
obj.show();
}
}
