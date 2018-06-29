package jenkinsTest;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleTest {
	
	Sample sample = null;
	  
	@BeforeClass
	public static void init(){
		System.out.println("Initialize Class");
		// sample = new Sample();
	}
	
	@Before
	public  void beforeeachTest(){
		System.out.println("before each Test Case");
	}
	
	@Test
	public  void sampleTest(){
		System.out.println("Sample Test");
	}
}