package Assisted_practise_project;

import java.util.*;

public class map {

	public static void main(String[] args) {	
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();   //Hashmap
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  //HashTable
	      
	      ht.put(8,"Raman");  
	      ht.put(9,"Aryan");  
	      ht.put(2,"Jack");  
	      ht.put(4,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }

	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();   //TreeMap 
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
