package javaQuestions;

public class Array03_LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
	
		int a[] = {12, 543, 8581, 126, 4, 1, 978, 543, 234};
		
		int temp = a[0];
		
		for(int i=1; i<a.length; i++) {
			
			if(temp < a[i]) {
				temp = a[i];
			}
		}
		
		System.out.println(temp);
		
	}

}
