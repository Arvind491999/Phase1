package Assisted_practise_project;
import java.util.*;

public class Queue_P {
	
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	                locationsQueue.add("Jabulpur");
	        		locationsQueue.add("Bhopal");
	        		locationsQueue.add("Indore");
	        		locationsQueue.add("Pune");
	        		locationsQueue.add("Mumbai");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
}
