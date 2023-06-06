/*
 * This java program check mood by message that will pass with constructor
 */
package com.moodanalysertest;
/**
 * 
 * @author Kaif
 *
 */
public class MoodAnalyserRe {
	
	/*
	 * As mentioned in refactor to build MoodAnalyser constructor
	 */
	private String message;
	
	/*
	 * To define constructor
	 */
	public MoodAnalyserRe(String message) {
		super();
		this.message = message;
	}
	/*
	 * To get the message from user
	 */
	public String getMessage() {
		return message;
	}
	
	/*
	 * To set the message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/*
	 * To define method analyseMood method
	 */
	public String analyseMoodRe() {
		if(getMessage().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
		}
	/**
	 * This is main method of program
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * To create object with message to analyze mood
		 */
		
		 MoodAnalyserRe mood = new  MoodAnalyserRe("I am in sad mood");
		 System.out.println(mood.analyseMoodRe());
		 
		 MoodAnalyserRe mood2 = new  MoodAnalyserRe("I am in any mood");
		 System.out.println(mood2.analyseMoodRe());
	}
}
