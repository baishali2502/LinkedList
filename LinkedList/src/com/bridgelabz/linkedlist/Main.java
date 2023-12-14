package com.bridgelabz.linkedlist;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		// UC-1:Creating new linked-list
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Operations:\n1.Insert at first\n"
				+ "2.Insert at last\n"
				+ "3.Insert at a certain position\n"
				+ "4.Size of linked-list\n"
				+ "5.Delete at first\n"
				+ "6.Delete at last\n"
				+ "7.Delete at any position\n"
				+ "8.search\n"
				+ "9.sort\n"
				+ "Choose: ");
		int choice = s.nextInt();
		while(choice!=-1) 
		{
		  if(choice==1)
		  {
			System.out.print("Enter number :");
			int val = s.nextInt();
			l.insertFirst(val);
			System.out.println("Node added at first position\n");
		  }
		  else if(choice==2)
		  {
			System.out.print("Enter number :");
			int val = s.nextInt();
			l.insertLast(val);
			System.out.println("Node added at the end\n");
		  }
		  else if(choice==3)
		  {
			  System.out.print("Enter number :");
			  int val = s.nextInt();
			  System.out.print("Enter position :");
			  int pos = s.nextInt();
			  l.insertAtP(val,pos-1);
			  System.out.println("Node added at position = "+pos+"\n");
		  }
		  else if(choice==4)
		  {
			  int n = l.size();
			  System.out.println("Size of linked-list = "+n+"\n");
		  }
		  else if(choice==5)
		  {
			  l.deleteFirst();
		  }
		  else if(choice==6)
		  {
			  l.deleteLast();
			  
		  }
		  else if(choice==7)
		  {
			  System.out.print("Enter number :");
			  int val = s.nextInt();
			  l.deleteByElem(val);
		  }
		  else if(choice==8)
		  {
			  System.out.print("Enter number :");
			  int val = s.nextInt();
			  int pos = l.search(val);
		  }
		  else if(choice==9)
		  {
			  l.sort();
		  }
		  
		  System.out.print("Enter choice :");
		  choice = s.nextInt();
		}
		

	}

}
