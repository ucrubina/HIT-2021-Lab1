package lab_numbers;

public class SwapNumbers {

	public static void main(String[] args) {
		int number1=120, number2= 220;
		System.out.println("Before swaping....");
		System.out.println("first number: "+number1);
		System.out.println("second number: "+number2);
		number1=number1+number2; //340
		number2=number1-number2;  //340-220=120
		number1=number1-number2;  //340-120=220
		System.out.println("After swaping....");
		System.out.println("first number: "+number1);
		System.out.println("second number: "+number2);
	}

}
