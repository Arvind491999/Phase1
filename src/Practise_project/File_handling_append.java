package Practise_project;

import java.io.FileWriter;
import java.io.IOException;

public class File_handling_append {

public static void main(String[] args){
String path = "C:\\Users\\Arvind Siloriya\\Documents\\Eclipse\\File Handling\\file.txt";
String text = " \n Name- Arvind Siloriya \n Qualification- Graduate\n Gender- Male \n Age- 22";
		try
		{
		FileWriter f = new FileWriter(path,true);
		f.write(text);
		f.close();
		System.out.println("Append done Successfully..");
		}
		catch(IOException e){
		System.out.println(e);
		}
		}
}