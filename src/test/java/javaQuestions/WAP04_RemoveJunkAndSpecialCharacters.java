package javaQuestions;

public class WAP04_RemoveJunkAndSpecialCharacters {

	public static void main(String[] args) {
		
		String s = "$%@$&^! Welcome to java !!";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		

	}

}
