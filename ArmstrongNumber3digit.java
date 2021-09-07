package week1.day2.assignments;

/*
 * Goal: To find whether a number is an Armstrong number or not
 * 
 * inputs: 153
 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
 *   
 * What are my learnings from this code?
 * 1) ^ is bitwise exclusive OR and can NOT be used to calculate power of a number 
  */

// Declare your input
// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
// Assign input into variable original
// Use loop to calculate: use while loop to set condition until the number greater than 0
// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
// Within loop: Add calculated with the cube of remainder & assign it to calculated
// Check whether calculated and original are same
//When it matches print it as Armstrong number

public class ArmstrongNumber3digit {

	public static void main(String[] args) {

		int inputnum = 153;
		int calculated = 0;
		int remainder;

		int original = inputnum;

		while (inputnum != 0) {
			remainder = inputnum % 10;
			inputnum = inputnum / 10;
			calculated = calculated + remainder * remainder * remainder;
			
		}

		if (calculated == original)
			System.out.println(calculated + " is Armstrong number ");

	}

}
