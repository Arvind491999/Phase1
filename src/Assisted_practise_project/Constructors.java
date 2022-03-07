package Assisted_practise_project;

public class Constructors {
	
	int id;  
    String name;  
    
    public Constructors()
    {	id = 143;
    }  
 
    public Constructors(int i,String n)
    {
	    id = i;  
	    name = n;
    }
     
    public void display()
    {
    	System.out.println(id+" "+ name);
    }  
   
    public static void main(String args[]){  
    	  
    	Constructors s1 = new Constructors();
    	Constructors s2 = new Constructors(333,"Aryan"); 
    	Constructors s3 = new Constructors(654,"Rehan"); 
    
    s1.display();  
    s2.display();
    s3.display();
    }
}
