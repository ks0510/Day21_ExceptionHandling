/*
*This java program checks the functionality of MoodAnalyser1
* program
*/
package com.moodanalyser1;
/*
 * To import assertions
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 
 * @author Kaif
 *
 */
public class MoodAnalyser1Test {
	
	MoodAnalyser1 mood3 = new MoodAnalyser1();
	
	/*
	 * To define moodAnalyserTest for SAD method which check
	 * moodAnalyser function is working or not
	 */
	@Test
	public void moodAnalyserTest1() {
		/*
		 * To make SAD a object because assertEquals method 
		 * compare with object
		 */
		Object SAD="SAD";
		String actualoutput = mood3.analyseMood1("I am in sad mood");
		assertEquals(SAD,actualoutput);
	}
	/*
	 * To define moodAnalyserTest for HAPPY method which check
	 * moodAnalyser function is working or not
	 */
	@Test
	public void moodAnalyserTest2() {
		/*
		 * To make HAPPY a object because assertEquals method 
		 * compare with object
		 */
		Object HAPPY="HAPPY";
		String actualoutput;
		actualoutput = mood3.analyseMood1("NULL");
		assertEquals(HAPPY,actualoutput);
	}
}
