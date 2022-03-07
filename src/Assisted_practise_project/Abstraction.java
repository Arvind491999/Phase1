package Assisted_practise_project;

public abstract class Abstraction {
	
	Abstraction (){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Abstraction {  
	 void run(){System.out.println("running safely..");}  
}
