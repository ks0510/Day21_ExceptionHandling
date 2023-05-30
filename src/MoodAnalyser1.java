/*
 * This java program check the mood from the given method with exception
 * handling.
 */
package com.moodanalyser1;
import java.util.*;
/**
 * 
 * @author Kaif
 *
 */
public class MoodAnalyser1 {
	
	/*
	 * To define method to find mood
	 */
	public String analyseMood1(String message) {
		try {
			if(message.contains("NULL"));
		}
		catch(Exception e) {
			return "HAPPY";
		}
		if(message.contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

	/**
	 * This is main method of program
	 * @param args
	 */
	public static void main(String[] args) {
		
		MoodAnalyser1 mood2 = new MoodAnalyser1();
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * In this use case we are giving null message to handle
		 * this invalid message
		 */
		
		String message ="NULL";
		
		System.out.println(mood2.analyseMood1(message));
	}
}
