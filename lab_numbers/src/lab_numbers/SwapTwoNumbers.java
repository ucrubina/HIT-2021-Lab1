package lab_numbers;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int number1=120, number2= 220, temp;   //creating a temporary variable temp
		System.out.println("Before swaping....");
		System.out.println("first number: "+number1);
		System.out.println("second number: "+number2);
		temp=number1;  //now temp is 120
		number1=number2;  //now no1 is 220
		number2=temp;  //no2 is 120
		System.out.println("After swaping....");
		System.out.println("first number: "+number1);
		System.out.println("second number: "+number2);
	}

}
