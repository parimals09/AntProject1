package abc.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class A4 
{
	
	@Test
	public void fourTest()
	{
		System.out.println("Hello Four");
		
		throw new SkipException("Skipped Test Case");
	}
}

