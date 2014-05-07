package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * ProgramStarter is Entry Point for program
 * 
 * @author des
 * 
 */
public class ProgramStarter {

	/**
	 * main Class where program ist started with
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws IOException { 
			
			int number1 = 0;
			int number2 = 0;
		
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter Integer 1:");
	        try{
	            number1 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        System.out.print("Enter Integer 2:");
	        try{
	            number2 = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        
	        ALMTest currentTest = new ALMTest();
	        int result = currentTest.testMultiply(number1 ,number2);
	        
	        System.out.println("ihr Resultat ist: " + result);
	    }

	}
