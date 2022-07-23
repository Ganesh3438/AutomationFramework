package javaQuestions;

public class WAP14_SumofNaturalNumber {

	public static void main(String[] args) {
		
		// 1+2+3+4+5+6+7+8+9+10.......+100 = 5050
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);

	}

}
