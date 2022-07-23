package javaQuestions;

public class WAP02_ReverseString {

	public static void main(String[] args) {
		
		String name = "java";

		String temp = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {

			temp = temp + name.charAt(i);

		}

		System.out.println(temp);
	}

}
