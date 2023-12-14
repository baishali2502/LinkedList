package com.bridgelabz.linkedlist;


public class LinkedList<T>
{
	Node<T> head = null;
	Node<T> tail = head;
    int size;
//---------------------------------- UC-2 ---------------------------------------
    /*
	 * @desc:This method inserts new element at the beginning of the list
	 * 
	 * @params:element to be added
	 * 
	 * @returns:none
	 */
	void insertFirst(T val) {
		Node<T> newnode = new Node<>(val);
		if(head==null) {
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
		size++;
	}
	//---------------------------------- UC-3 ---------------------------------------
	/*
	 * @desc:This method inserts new element at the end of the list
	 * 
	 * @params:element to be added
	 * 
	 * @returns:none
	 */
	void insertLast(T val)
	{
		Node<T> newnode = new Node<>(val);
		if(head==null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}
	//---------------------------------- UC-4 ---------------------------------------
	
	/*
 	 * @desc:This method inserts new element at the any position of the list
 	 * 
 	 * @params:element to be added and position
 	 * 
 	 * @returns:none
 	 */
	 void insertAtP(T val, int pos) 
	{
		if(pos==0)
		{
			insertFirst(val);	
		}
		else 
		{
			int i=0;
		    Node<T> newnode = new Node<>(val);
		    Node<T> temp = head;
		    while(i<pos-1)
		    {
		    	temp = temp.next;
		    	i++;
		    }
		    newnode.next = temp.next;
		    temp.next = newnode;
		}
		
	}
	//---------------------------------- UC-5 ---------------------------------------
	 
	 /*
		 * @desc:This method deletes element at the beginning of the list
		 * 
		 * @params:none
		 * 
		 * @returns:none
		 */
		void deleteFirst() {
			if(head==null)
				System.out.println("Can't delete , linked-list is empty\n");
			else {
				head = head.next;
				System.out.println("First node deleted\n");
			}
			
		}
}
