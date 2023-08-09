package codes;

import java.util.ArrayList;
import java.util.List;

public class dcate {
	public static void main(String [] args) {
		int []arr=new int[] {1,2,3,4,4,4,5,5};
		List<Integer> dupEl=new ArrayList<Integer>();
		List<Integer> duplicateElem=new ArrayList<Integer>();
		//System.out.println("Hello world");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 if(!duplicateElem.contains(arr[j])) {
						 duplicateElem.add(arr[j]);
					 }
					 //System.out.println("Hello world "+arr[j]);		 
				 }
			 }
			 
		 }
		 
			System.out.println("Duplicate Elements found"+duplicateElem);					

		
	}

}

public class dcate2 {
	public static void main(String [] args) {
		int []arr=new int[] {1,2,3,4,4,4,5,5};
		List<Integer> dupEl=new ArrayList<Integer>();
		List<Integer> duplicateElem=new ArrayList<Integer>();
		//System.out.println("Hello world");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 if(!duplicateElem.contains(arr[j])) {
						 duplicateElem.add(arr[j]);
					 }
					 //System.out.println("Hello world "+arr[j]);		 
				 }
			 }
			 
		 }
		 
			System.out.println("Duplicate Elements found"+duplicateElem);					

		
	}

}
public class dcate3 {
	public static void main(String [] args) {
		int []arr=new int[] {1,2,3,4,4,4,5,5};
		List<Integer> dupEl=new ArrayList<Integer>();
		List<Integer> duplicateElem=new ArrayList<Integer>();
		//System.out.println("Hello world");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 if(!duplicateElem.contains(arr[j])) {
						 duplicateElem.add(arr[j]);
					 }
					 //System.out.println("Hello world "+arr[j]);		 
				 }
			 }
			 
		 }
		 
			System.out.println("Duplicate Elements found"+duplicateElem);					

		
	}

}


<<<<<<< Updated upstream
public class dcateCloud {
=======
public class dcateLocal {
>>>>>>> Stashed changes
	public static void main(String [] args) {
		int []arr=new int[] {1,2,3,4,4,4,5,5};
		List<Integer> dupEl=new ArrayList<Integer>();
		List<Integer> duplicateElem=new ArrayList<Integer>();
		//System.out.println("Hello world");
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[i]==arr[j]) {
					 if(!duplicateElem.contains(arr[j])) {
						 duplicateElem.add(arr[j]);
					 }
					 //System.out.println("Hello world "+arr[j]);		 
				 }
			 }
			 
		 }
		 
			System.out.println("Duplicate Elements found"+duplicateElem);					

		
	}

}
