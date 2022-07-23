package javaQuestions;

public class WAP26_StaticBlockBeExecutedWithFinalvariable {

	public static void main(String[] args) {

		System.out.println(Main.x);  // It will not call the static method when you declare variable as final
		//Note: if you remove final keyword and call variable then it will call static method first and then it will print variable
		
	}

}

class Main{
	public static final int x = 100;
	
	static {
		System.out.println("main---- class static block");
	}
}
