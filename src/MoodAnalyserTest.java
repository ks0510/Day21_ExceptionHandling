/*
 * This java program checks the functionality of MoodAnalyser
 * program
 */
package com.moodanalysertest;
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

public class MoodAnalyserTest {
	
	/*
	 * To create MoodAnalyser class object
	 */
	MoodAnalyser mood1 = new MoodAnalyser();
	
	/*
	 * To define moodAnalyserTest for SAD method which check
	 * moodAnalyser function is working or not
	 */
	@Test
	public void moodAnalyserTest() {
		Object SAD="SAD";
		String actualoutput = mood1.analyseMood("I am in sad mood");
		assertEquals(SAD,actualoutput);
	}
	
	
	/*
	 * To define moodAnalyserTest for HAPPY method which check
	 * moodAnalyser function is working or not
	 */
	@Test
	public void moodAnalyserTest1() {
		Object HAPPY="HAPPY";
		String actualoutput = mood1.analyseMood("I am in any mood");
		assertEquals(HAPPY,actualoutput);
	}
}
