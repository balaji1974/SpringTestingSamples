package aero.alsalam.testingsamples;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestingSamplesApplicationTests {
	
	@BeforeAll
	public static void classLevelBeforeAll() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void methodLevelBeforeEach() {
		System.out.println("Before Each");
	}
	

	@Test
	void contextLoads1() {
		System.out.println("Test 1");
		
	}
	
	@Test
	void contextLoads2() {
		System.out.println("Test 2");
		
	}
	
	@AfterEach
	public void methodLevelAfterEach() {
		System.out.println("After each");
	}

	@AfterAll
	public static void methodLevelAfterAll() {
		System.out.println("After All");
	}



}
