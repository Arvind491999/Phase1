package Practise_project;

import java.io.FileWriter;
import java.io.IOException;

public class File_handling1 
{	
	 public static void main(String[] args){
		 try
		 {
		FileWriter f = new FileWriter("C:\\Users\\Arvind Siloriya\\Documents\\Eclipse\\File Handling\\file.txt");
		 try
		 {
		 f.write("---------------I am Arvind--------------------");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("Successfully Written!! ");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }
		 }
		}

