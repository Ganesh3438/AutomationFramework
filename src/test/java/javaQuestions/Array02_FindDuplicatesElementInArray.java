package javaQuestions;

import java.util.HashSet;
import java.util.Set;

public class Array02_FindDuplicatesElementInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 6, 3, 1, 8, 44, 3 };

		// approach 1:
		for (int i = 0; i < a.length; i++) {

			for (int j = i+1; j < a.length; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		System.out.println("----------------------");
		
		//approach 2:
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(Integer i: a) {
			
			if(set.add(i) == false) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
