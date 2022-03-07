package Practise_project;

import java.util.regex.Pattern;

public class Validation_Email_ID {
	
	public static boolean isValid(String email)
	 {
	 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
	 "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	 Pattern pat = Pattern.compile(emailRegex);
	 if (email == null)
	 return false;
	 return pat.matcher(email).matches();
	 }
	 public static void main(String[] args) {
	 String email1 = "arvindsiloriya@gmail.com";
	String email2 = "@arvind5885.com";
	String email3 = "siloriya499gmail.com";
	String email4 = "siarvind@gmail.com";
	String email5 = "siloriya123@gmailcom";
	 String[] emails= {email1,email2,email3,email4,email5};
	 for (int i = 0; i < emails.length; i++) {
	 String email=emails[i];
	if (isValid(email))
	 System.out.print(email+" -- VALID EMAIL ID");
	 else
	 System.out.print(email+" -- INVALID EMAIL ID");
	 System.out.println();
	 }
	 }

}
