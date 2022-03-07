package Assisted_practise_project;

public class Exception_handling extends Exception {
	
	 String str1;
	 Exception_handling(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception_handling("This is My error Message");
		}
		catch(Exception_handling exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
