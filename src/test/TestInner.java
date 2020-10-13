package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.InnerProblems;
import main.InnerProblems.LastName;
import main.InnerProblems.FirstName;


class TestInner {
	
	InnerProblems test;
	FirstName testFname;
	LastName testLname;
	
	
	@BeforeEach 
	void init() {
		test = new InnerProblems();
		testFname = test.new FirstName("Charles");
		testLname = test.new LastName("Bartels");
	}
	
	@DisplayName("Test FullName")
	@Test
	void testFullName() {
		String expected = "Charles Bartels";
		
		String actual = test.nameFull(testFname, testLname);
		
		assertEquals(actual, expected);
	}

}
