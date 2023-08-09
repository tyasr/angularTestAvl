package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class secLargest {
	 public static int findSecondMax(int[] arr) {
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("The array must contain at least two elements.");
	        }

	        return Arrays.stream(arr)               // Convert array to stream
	                     .boxed()                   // Convert int stream to Integer stream
	                     .sorted((a, b) -> b - a)   // Sort in descending order
	                     .skip(1)                   // Skip the first element (max element)
	                     .findFirst()               // Find the first element (second max element)
	                     .orElseThrow(() -> new RuntimeException("Unable to find the second maximum element."));
	    }

	    public static void main(String[] args) {
	        int[] arr = {12, 45, 6, 32, 19, 8, 50, 23};
	        int secondMax = findSecondMax(arr);
	        System.out.println("Second maximum element: " + secondMax);
	    }

}
