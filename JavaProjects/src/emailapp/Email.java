package emailapp;

import java.util.Scanner;



public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String  department;
	private int mailboxCapacity=500;
	private int defaultpasswordlenth=10;
	private String aletrnateEmail;
	private String companySuffix = "myconpany.com";
	
	
	///Contructor to receive the first name and last name
		public Email(String firstName,String lastName) {
			this.firstName= firstName;
			this.lastName = lastName;
			//System.out.println("EMAIL CREATED :" +this.firstName+ " "+this.lastName);
			
			//Call a method  to  ask for  the  department and return the department
			this.department = setDepartment();
			//System.out.println("Department: " +this.department);
			
			///call a method to return a random password
			
			this.password = randomPassword(defaultpasswordlenth);
			System.out.println("Your password is : " +this.password);
			
			//Combine elements to  generates e-mail
			
			email = firstName.toLowerCase() + "."+ lastName.toLowerCase()+ "@" +department + "." + companySuffix;
			//System.out.println("Your mail is  :" + email);
		}
	///Ask for the deparment 
		private String setDepartment() {
			System.out.println("DEPARTMENTS CODES\n1 for Sales\n2 for the Development\n3 for the Accounting\n0 for none\nEnter Department code:");
			java.util.Scanner in = new  Scanner(System.in);
			int depChoice = in.nextInt();
			if(depChoice ==1) {return "Sales";}
			else if(depChoice ==2 ) {return "dev";}
			else if(depChoice == 3 ) {return "acct";}
			else {return "";}
			
		}
		//Generate a random password;
		private String randomPassword(int length) {
			String passwordSet ="ABCDEFGHJKLMNLOPQZ12345677890@!%^&$*";
			char [] password = new char[length];
			for(int i=0;i<length;i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				}
			return new String(password);
		}
	
	
	
	//Set the mailbox Capacity
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
	
	///Set alternate email
		
		public void setAlternativEmail(String altEmail) {
			
			this.aletrnateEmail=altEmail;
			
		}
	
	//Change the paswword
		public void changePassword(String password) {
			this.password = password;
		}
		
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		
		public String getAlternateEmail() {
			return aletrnateEmail;
		}
		
		public String getPassword() {
			return password;
		}
		public String  showInfo() {
			return "DISPLAY NAME :" +firstName + " " +lastName + 
					"\nCOMPANY EMAIL :" + email+
					"\nMAILBOX CAPACITY" + mailboxCapacity +"mb";
		}
}
