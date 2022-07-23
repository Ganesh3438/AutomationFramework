package selenium_activities;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Print prime numbers");

		int temp = 0;

		for (int i = 1; i <= 100; i++) {

			for (int j = 2; j <= i - 1; j++) {

				if (i % j == 0) {
					temp = temp + 1;
				}

			}
			if (temp == 0) {
				System.out.println(i);
			} else {
				temp = 0;
			}
		}

	}

}
