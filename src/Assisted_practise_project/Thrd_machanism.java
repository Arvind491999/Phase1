package Assisted_practise_project;

public class Thrd_machanism {
	
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thread mt = new  Thread();
  		mt.run();
 	}

}
