package javaQuestions;

public class WAP21_PassingNullArgument {

	public static void main(String[] args) {
		
		test(null); // the output will be String argument
		

	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {
		System.out.println("String Argument");
	}

}
