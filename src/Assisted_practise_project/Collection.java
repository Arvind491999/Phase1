package Assisted_practise_project;

import java.util.*;

public class Collection {
	
	public static void main(String[] args) {
		
		System.out.println("ArrayList");	//creating arraylist
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Pune");
	      city.add("Mumbai");    	   
	      System.out.println(city);  
		
	      System.out.println("\n");	//creating vector
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector<Integer>();
	      vec.addElement(45); 
	      vec.addElement(65); 
	      System.out.println(vec);
		
	      System.out.println("\n");	//creating linkedlist
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Raman");  
	      names.add("Aryan");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       System.out.println("\n");	//creating hashset
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       System.out.println("\n");	//creating linkedhashset
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      
	}
	}