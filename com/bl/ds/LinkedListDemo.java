package com.bl.ds;

import java.util.Scanner;

public class LinkedListDemo {
	 Node head;//starting point of linkedList
	
	static class Node{
		int data;
		Node nextNodeAddress;
			Node(int d){
				data = d;
				nextNodeAddress = null;
		}//constructor
	}
	
	void printList() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.nextNodeAddress;
		}
		System.out.println();
	}
	
	public void add(int data)
	{
		Node new_node = new Node(data);
		//Node pre = new Node(data);
		if(head==null)
		{
			head=new_node;
		}else {
			Node temp = head;
			while(temp.nextNodeAddress!=null)
			{
				
				temp=temp.nextNodeAddress;
			}
			temp.nextNodeAddress=new_node;
		}
	}
	
	public void search(int data) {
		Node current_node ;//= new Node(data);
		//Node temp = head;
		current_node = head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(current_node != null)
			{
				if(current_node.data == data)
				{
					System.out.println("Data is already in list");
					break;
				}
				else if(current_node.nextNodeAddress == null)
				{
					System.out.println("search element is not present in this list");
				}
				current_node = current_node.nextNodeAddress;
			}
			//System.out.println("search elemt is not in a list");
		}	
	}
	
	public   int countLength() {
		int z=0;
		Node temp = head;
		Node tail_node = head;
		if(head == null)
		{
			z=0;
			//System.out.println("no. of elemt in a list is "+z);
		}
		else
		{
			while(tail_node != null)
			{
				z++;
				if(tail_node.nextNodeAddress == null)
				{
					
					System.out.println("no. of elemt in a list is "+z);
					break;
				}
				tail_node = tail_node.nextNodeAddress;
			}	
		}
		return z;
	}
	public void printReverse(Node head) {
		if(head == null)
		{
			//System.out.print("list is empty");
			return ;
		}
		
		printReverse(head.nextNodeAddress);
		System.out.print(head.data+"<-");
		
	}
	
	public void deleteFirst() {
		Node temp = head;
		if(temp != null)
		{
			head = temp.nextNodeAddress;
		}
		
	}
	
	public void deleteLast() {
		Node temp = head;
		Node previous = head;
		while(temp.nextNodeAddress != null)
		{
			previous = temp;
			temp = temp.nextNodeAddress;
		}
		previous.nextNodeAddress = null;
	}

	public void deleteAtPosition(int position) {
		Node temp = head;
		Node pre = head;
		int count = 1;
		int z = countLength();
		if(position == 1)
		{
			deleteFirst();
		}
		else if(z == position)
		{
			deleteLast();
		}
		else 
		{
			while(temp.nextNodeAddress!=null)
			{
				count++;
				pre = temp;
				temp = temp.nextNodeAddress;
				if(count == position)
				{
					break;
				}
			}
			pre.nextNodeAddress=temp.nextNodeAddress;
		}
	}
	public static void main(String[] args) {
		LinkedListDemo llist = new LinkedListDemo();
//			
//	/*		llist.head = new Node(1);
//			Node second = new Node(2);
//			llist.head.nextNodeAddress = second;
//			
//			Node third = new Node(3);
//			second.nextNodeAddress = third;
//			
//			Node four = new Node(4);
//			third.nextNodeAddress = four;
//			
//			Node five = new Node(5);
//			four.nextNodeAddress = five;
//			
//			Node six = new Node(6);
//			five.nextNodeAddress = six;
//			
//			Node seven = new Node(7);
//			six.nextNodeAddress = seven;
//			
//			Node eight = new Node(8);
//			seven.nextNodeAddress = eight;
//			
//			Node nine = new Node(9);
//			eight.nextNodeAddress = nine;
//			
//			Node ten = new Node(10);
//			nine.nextNodeAddress = ten;
//			
//			llist.add(11);
//		
//			llist.add(1);
//			llist.add(2);
//			llist.add(3);
//			llist.add(4);
//			llist.add(5);
//			llist.add(6);
//			llist.add(7);
//			llist.add(8);
//			llist.add(9);
//			llist.add(10);
//			llist.printList();
//			llist.search(3);
//			llist.printList();*/
			Scanner scan = new Scanner(System.in);
			int i = 0;
			do {
				System.out.println("enter 1 for insertion");
				System.out.println("enter 2 for search ");
				System.out.println("enter 3 for count ");
				System.out.println("enter 4 for reverse list print ");
				System.out.println("enter 5 for delete 1st element ");
				System.out.println("enter 6 for delete last element ");
				System.out.println("enter 7 for delete any position element ");
				//System.out.println(" for select operations type 0");
				i = scan.nextInt();

				if(i == 1)
				{
					System.out.println("Enter the data to be insert");
					int x = scan.nextInt();
					llist.add(x);
					llist.printList();
					i = 0;
				}
				else if(i == 2)
				{
					System.out.println(" enter number that you want to search");
					int x = scan.nextInt();
					llist.search(x);
					llist.printList();
					i = 0;
				}
				else if(i == 3)
				{
					llist.countLength();
					llist.printList();
					i = 0;
				}
				else if(i == 4)
				{
					llist.printReverse(llist.head);
					System.out.println();
					i = 0;
				}
				else if(i == 5)
				{
					llist.deleteFirst();
					llist.printList();
					i = 0;
				}
				else if(i == 6)
				{
					llist.deleteLast();
					llist.printList();
					i = 0;
				}
				else if(i == 7)
				{
					System.out.println(" enter index number that you want to delete");
					int position = scan.nextInt();
					llist.deleteAtPosition(position);
					llist.printList();
					i = 0;
				}
			}while(i == 0);
			
			
			
	}
	

}

