package Assisted_practise_project;

 public class Custom_exceptions extends Exception  {

	 public Custom_exceptions(String s) 
	    { 
	        super(s); 
	    } 
	} 
   class Main 
	{ 
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new Custom_exceptions("temp"); 
	        } 
	        catch (Custom_exceptions ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
}
