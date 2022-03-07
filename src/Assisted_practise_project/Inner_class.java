package Assisted_practise_project;

public class Inner_class {

	private String msg = "Inner Classes";

	void display(){  
		
	class Inner{  
	 void msg()
	{
		System.out.println(msg);
	}  
}  
		  
	Inner l=new Inner();  
		  l.msg();  
}  

		public static void main(String[] args) {
		Inner_class  ob=new Inner_class ();  
		ob.display();  
	}
}


