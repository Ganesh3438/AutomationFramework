package javaQuestions;

public class WAP01_Palindrome {

	public static void main(String[] args) {
		
		String name = "mom";
		
		String temp = "";
		for(int i=name.length()-1; i>=0; i--) {
			
			temp = temp + name.charAt(i);
			
		}
		
		System.out.println(temp);
		
		if(temp.equals(name)) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}

	}

}
