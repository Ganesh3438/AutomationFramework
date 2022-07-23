package javaQuestions;

public class WAP27_StaticBlockQuestions {

	public static void main(String[] args) {
		
		/*
		 * Java Static block interview questions:
		 * 
		 *   Q1. Explain static blocks in java?
		 *   
		 *   Q2. How can we run a java program without making an object?
		 *   
		 *   Q3. Similarity and Difference between static block and static method?
		 *   
		 *   Q4. How can we create objects if we make the constructor private?
		 *   
		 *   Q5. Is it possible to compile and run a java program without writing main() method?
		 *   
		 *   Q6. Can we initialize member variables within static blocks?
		 *   
		 *   
		 */

		
		System.out.println("Main method");
		
		// Scenario 1: static blocks will execute before main method
				
	}
	
	static {
		System.out.println("static block1"); 
		
	}
	
	static {
		System.out.println("static block2"); 
		
	}
	
	static {
		System.out.println("static block3"); 
		
	}

}
