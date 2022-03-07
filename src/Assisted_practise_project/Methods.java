package Assisted_practise_project;

public class Methods {
	
	public int calculate (int a, int b)
	{
		 System.out.println("Area of Triangle : "+(5*a*b));
		 return a;
	}
	
	public float calculate (int r)
	{
		System.out.println ("Area of circle  : "+ (3.14*r*r));
		return r;
	}
	
	public void calculate (float d, char e)
	{
		System.out.println("Addition value  : "+ (5+d+e));
	}
	
	public double calculate (double g, int h, long k)
	{
		System.out.println("The value is : "+ (66*g/h*k));
	    return g;
	}


	 public static void main(String args[])
	    {
		 Methods ob = new Methods();
		 
		 ob.calculate(5, 6);
		 ob.calculate(2);
		 ob.calculate(72.83f, 'M');
		 ob.calculate(5.254654684684, 5, 546546568654L);		 			 
     }

   }

