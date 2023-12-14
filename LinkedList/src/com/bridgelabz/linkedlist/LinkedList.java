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
	//---------------------------------- UC-6 ----------------------------------------
		
	/*
	 * @desc:This method deletes element at the end of the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
	void deleteLast() {
		if (head == null)
			System.out.println("Can't delete , linked-list is empty\n");
		else {
			Node<T> temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
			System.out.println("Last node deleted\n");
		}
	}

	//---------------------------------- UC-7 ----------------------------------------
	
	/*
	 * @desc:This method searches for an elem and returns it's position(if present)
	 * 
	 * @params:element to be searched
	 * 
	 * @returns:position of the element inside the linkedlist (if present)
	 */
	int search(T elem)
	{
		if(size==0)
			return -1;
		else
		{
			Node<T> temp = head;
			int pos=0;
			while(temp!=null)
			{
				if(temp.data==elem)
					return pos;
				pos++;
			}
			// elem not fount
			return -1;
		}
	}
}
