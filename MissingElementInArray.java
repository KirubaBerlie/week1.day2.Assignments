
// Goal: To find missing elements in an array

//Here is the input
// int[] arr = {1,2,3,4,7,6,8};

// Sort the array	
// loop through the array (start i from arr[0] till the length of the array)
// check if the iterator variable is not equal to the array values respectively
// print the number
// once printed break the iteration

//What are my learnings from this code?
//1) when initializing the loop iterator for handling array be cautious it is NOT always zero
 


package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };

		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if (i != arr[i-1])

			{
				System.out.println("Missed Number in the array is " + i);
				break;

			}
		}

	}

}
