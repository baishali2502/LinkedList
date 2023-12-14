package com.bridgelabz.linkedlist;
import java.util.*;

import com.bridgelabz.datastructure.Node;

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
		size++;
		
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
			size--;
			
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
		size--;
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
	//---------------------------------- UC-9 ----------------------------------------
	
	/*
	 * @desc:This method deletes an elem (if present) inside the linked-list
	 * 
	 * @params:element to be deleted
	 * 
	 * @returns:void
	 */
	void deleteByElem(T elem) {
		if (size == 0) {
			return;
		} else {
			// first node is the node to be deleted
			if (head.data == elem) {
				head = head.next;
				return;
			}
			Node<T> prev = head;
			Node<T> temp = head.next;
			while (temp != null) {
				if (temp.data == elem) {
					prev.next = temp.next;
					return;
				}
				prev = prev.next;
				temp = temp.next;
			}
		}
        size--;
	}
	//---------------------------------- UC-10 ----------------------------------------
	
	/*
	 * @desc:This method sorts the list
	 * 
	 * @params:none
	 * 
	 * @returns:none
	 */
	void sort()
	{
		ArrayList<T> list = new ArrayList<>();
		Node<T> temp = head;
		int data = 0;
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
		}
		list.sort(null);
		head=null;
		tail=head;
		for(int i=0;i<list.size();i++)
		{
			insertLast(list.get(i));
		}
	}
	
}
