package Practise_project;

import java.io.FileReader;
import java.io.IOException;

public class File_handling_read {
	
public static void main(String[] args){
		try
		{
FileReader r = new FileReader("C:\\Users\\Arvind Siloriya\\Documents\\Eclipse\\File Handling\\file.txt");
		try
		{
		int i;
		while((i=r.read())!=-1)
		{
		System.out.print((char)i);
		}
		}
		finally
		{
		r.close();
		System.out.print("\n");
		System.out.print("File Closed successfully.");
		}
		}
		catch(IOException e)
		{
		System.out.println("Exception handled..");
		}
		}

}
