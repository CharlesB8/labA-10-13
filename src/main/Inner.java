package main;


class InnerProblems {
	 
	 
	
	class DateOfBirth {
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
	class FirstName {
		String myFirstName;
		public FirstName(String myFirstName) {
		this.myFirstName = myFirstName;
	}

		public String getMyFirstName() {
			return this.myFirstName;
		
	}
		
	}	
	class LastName {
		public String nameL(String a) {
			return a;
		}
	}	
	class FullName {
		public String nameFull(FirstName a, LastName b) {
			return a + " " + b;
		}
	}
	
	
	
}







public class Inner {
	
	public static void main(String[] args) {
		
		InnerProblems charles = new InnerProblems();
		InnerProblems.FirstName myName = charles.new FirstName("Charles");
		
		System.out.println(myName.getMyFirstName());
		
		InnerProblems him = new InnerProblems();
		InnerProblems.DateOfBirth birth = him.new DateOfBirth(12, 12, 2222);
		System.out.println(birth.getMyBirthday());
		
		
		
	}
	

		
		
	
	
}

