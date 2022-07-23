package javaQuestions;

public class WAP11_FibonaciiSeries {

	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8 13 21 34....100
		
	int num = 10;
	int t1=0;
	int t2=1;
//	int c;
	
	for(int i=1; i<=num; i++) {
		
		System.out.println(t1);
		int sum = t1 + t2;  // 0+1 = 1  ---> sum 2
		t1 = t2; // t1=1 t2 =1
		t2 = sum;// 2
		
//		c = t1 + t2;
//		System.out.println(" "+c);
//		t1 = t2;
//		t2 = c;
	}
		
	}
	
}
