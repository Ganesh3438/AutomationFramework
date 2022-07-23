package javaQuestions;

public class WAP17_ArmstrongNumbers {

	public static void main(String[] args) {
		
		int num = 153;  // 1*1*1 + 5*5*5 + 3*3*3 = 153
		int actualNum = num;
		double rev = 0;
		while(num!=0) {
			int n = num % 10;
			rev = rev + Math.pow(n, 3);
			num = num /10;
		}

		System.out.println(rev);
		
		if(actualNum==rev) {
			System.out.println("It is an armstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
	}

}
