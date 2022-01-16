//Lab1 Part2 John Rosar
//COSC1437-83653

import java.util.Scanner;

public class PracticeWithVariables_Rosar {
    public static void main(String[ ] args)
    {
    	//Scanner statements to read input from user and store as variables
    	System.out.println("Enter a word: ");
        Scanner keyboard1 = new Scanner(System.in);
		String word1 = keyboard1.next();
		
		System.out.println("Enter a word: ");
        Scanner keyboard2 = new Scanner(System.in);
		String word2 = keyboard2.next();
		
		System.out.println("Enter a word: ");
        Scanner keyboard3 = new Scanner(System.in);
		String word3 = keyboard3.next();
		
		System.out.println("Enter a decimal number: ");
        Scanner keyboard4 = new Scanner(System.in);
        float dNum1 = keyboard4.nextFloat();
        
        System.out.println("Enter a decimal number: ");
        Scanner keyboard5 = new Scanner(System.in);
        float dNum2 = keyboard5.nextFloat();
        
        //Outputting variables
        System.out.println("-------------------------------------------------------");
		System.out.println("File: PracticeWithVariables_Rosar.java");  
		System.out.println("Summer semester – John Rosar"); 
		System.out.println("-------------------------------------------------------");
		System.out.println("Word1: " + word1);  
		System.out.println("Word1: " + word2);  
		System.out.println("Word1: " + word3); 
		
		System.out.println("First number: " + dNum1);
		System.out.println("Second number: " + dNum2);
		
		float numAv;
		
		numAv = ((dNum1 + dNum2) / 2);
		
		System.out.println("Average of " + dNum1 + " and " + dNum2 + " is: " + numAv);
        System.out.println("-------------------------------------------------------");	
    }
}
