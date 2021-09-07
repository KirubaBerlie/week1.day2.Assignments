/*
Palindrome of a number
=======================
Pseudocode
STEP 1 : Declare the variable as int =454;
STEP 2 : Hold the number in a temporary variable.
STEP 3 : Reverse that number.
STEP 4 : Compare the temporary number with the reversed number.
STEP 5 : If both numbers are the same, print "palindrome number".
STEP 6 : Else print "not palindrome number".

Expected Output
Palindrome of the given number is : 454 

*/


package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		int var = 24542;
		int temp = var;
		int rev =0; 
		
		int remainder;
			
		
		while(temp!=0)
			
		{
			remainder = temp % 10;
			rev =rev*10 + remainder;
			temp = temp/10;
			
		}
		if (rev ==var)
			System.out.println("Palindrome of the given number is :"+ rev );
		else
			System.out.println(var + " is NOT a Palindrome number");
	}
	

}
