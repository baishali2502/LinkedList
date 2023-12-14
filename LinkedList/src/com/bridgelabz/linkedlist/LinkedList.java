package com.bridgelabz.linkedlist;


public class LinkedList<T>
{
	Node<T> head = null;
	Node<T> tail = head;
    int size;
//---------------------------------- UC-1 ---------------------------------------
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
	}
}
