/*
 Print the frequency of number in an array
 =====================================
Step 1: Declare and initialize an array arr int[] arr={3,4,2,5,1,2,6,3,6,2,4,7,1}.

Step 2: Declare another array fr with the same size of array arr. It is used to store the frequencies of elements present in the array.

Step 3: Variable visited will be initialized with the value -1. It is required to mark an element visited that is, it helps us to avoid counting the same element again.

Step 4:The frequency of an element can be counted using two loops. One loop will be used to select an element from an array, and another loop will be used to compare the selected element with the rest of the array.

Step 5: Initialize count to 1 in the first loop to maintain a count of each element. Increment its value by 1 if a duplicate element is found in the second loop. (Since we have counted this element and didn't want to count it again. Mark this element as visited by setting fr[j] = visited. Store count of each element to fr)

Step 6: Finally, print out the element along with its frequency.

Expected Output
1 occurred 2 times
2 occurred 3 times
3 occurred 2 times
4 occurred 2 times
5 occurred 1 times
6 occurred 2 times
7 occurred 1 times
*/
package week1.day2.assignments;

import java.util.Arrays;

public class FrequencyOfNumberInArray {

	public static void main(String[] args) {

		int arr[] = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		int len = arr.length;

		Arrays.sort(arr);
		int count = 0;

		int arrFr[] = new int[len];

		for (int i = 0; i < len; i++) {

			if (arr[i] == -1)
				continue;
			count = 1;

			for (int j = i + 1; j < len; j++)
			{
				if (arr[i] == arr[j]) {

					++count;
					arr[j] = -1;
				}
			}
			arrFr[i] = count;
			System.out.println(arr[i] + " occurred " + arrFr[i] + " times");
		}

	}

}
