package com.moodanalyser1;
import java.util.Scanner;

import com.moodanalyser1.MoodAnalysisException;
/**
 * 
 * @author Kaif
 *
 */

public class MoodAnalyser2 {

	/*
	 * To define method to find mood
	 */
	public String analyseMood2(String message)throws MoodAnalysisException {
		if (message == null || (message==" ")) {
			throw new MoodAnalysisException("");
		}
		else if(message.contains("sad")) {
		return "SAD";
		}
		return "HAPPY";
	}

	/**
	 * This is main method of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws MoodAnalysisException{

		MoodAnalyser2 mood2 = new MoodAnalyser2();

		Scanner sc = new Scanner(System.in);

		/*
		 * In this use case we are giving null message to handle this invalid message exception
		 */

		String message1 = null;

		try{
		  mood2.analyseMood2(message1);
		}catch(MoodAnalysisException e) {
			System.out.println(e+" Invalid Mood");
		}
		
		/*
		 * To handle empty mood exception
		 */
		String message2 = " ";

		try{
		  mood2.analyseMood2(message2);
		}catch(MoodAnalysisException e) {
			System.out.println(e+" Empty Mood");
		}
	}

}
