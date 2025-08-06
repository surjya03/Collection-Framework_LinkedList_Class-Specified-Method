package com.Aot;


import java.util.LinkedList;

public class link {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<>();
		//LinkedList Class Specified Method: 
		
		ll.add("Surjya");	//Appends the element to the End
		ll.add("Naben");
		ll.add("Sudip");
		
		System.out.println(ll);	//To show all the elements
		
		System.out.println(ll.size()); //To get the size of the list
		
		ll.addFirst("MCA");
		System.out.println("Adding the First element: "+ll);
		
		ll.addLast("AOT");
		System.out.println("Adding the Last element: "+ll);
		
		System.out.println("Getting the First element: "+ll.getFirst());	//getFirst()
		
		System.out.println("Getting the Last element: "+ll.getLast());	//getLast()
		
		ll.clear();
		System.out.println(ll);	//To remove all the Elements
		
		LinkedList<String> ll2= new LinkedList<>();
		ll2.add("java");
		ll2.add("python");
		ll2.add("R");
		ll2.add("c");
		
		LinkedList<String> ll3= new LinkedList<>();
		ll3.add("R");
		ll3.add("python");
		//Remove all the elements from ll2 which are present in 'll3'
		ll2.removeAll(ll3);
		System.out.println(ll2);

	}

}
