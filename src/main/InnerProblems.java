package main;

import main.InnerProblems.FirstName;
import main.InnerProblems.LastName;

public class InnerProblems {

	 
	
	public class DateOfBirth {
		private Integer month; 
		private Integer day;
		private Integer year; 
		private String birthday;
		
		public DateOfBirth(Integer month, Integer day, Integer year) {
			this.month = month;
			this.day = day;
			this.year = year;
			birthday = Integer.toString(this.month) + '/' + Integer.toString(this.day) + '/' + Integer.toString(this.year);
			
		
		}
		
		public String getMyBirthday() {
			
			return  birthday;
		}
	}
	
	public class FirstName {
		 String myFirstName;
		 
		 public FirstName(String myFirstName) {
			 this.myFirstName = myFirstName;
		 }

		 
		 public void setMyFirstName(String myFirstName) {
				this.myFirstName = myFirstName;
			}
		 
		public String getMyFirstName() {
			return myFirstName;
		}

		
		
	
		
	}	
	public class LastName {
		String myLastName;
		
		public LastName(String myLastName) {
			this.myLastName = myLastName;
		}
		
		public void setMyLastName(String myLastName) {
			this.myLastName = myLastName;
		}
		
		public String getMyLastName() {
			return this.myLastName;
		}
	}	
	
	
	
		
	public static String nameFull(FirstName a, LastName b) {
		return a + " " + b;
	}
	
	
}
