package lab_numbers;
import java.util.Scanner;
public class mainSwitch {

	public static void main(String[] args) {
		char operator;
		Double number1,number2,result;
		Scanner input= new Scanner(System.in);
		System.out.println("choose an operator: +,-,*, or /");
		operator= input.next().charAt(0);
		
		System.out.println("enter the first number");
		number1=input.nextDouble();
		
		System.out.println("enter the second number");
		number2=input.nextDouble();
		
		switch(operator) {
		case '+':
			result=number1 + number2;
		System.out.println(number1 + "+" + number2 + "=" +result);
			break;
			
		case '-':
			result=number1 - number2;
		System.out.println(number1 + "-" + number2 + "=" +result);
			break;
			
		case '*':
			result=number1 * number2;
		System.out.println(number1 + "*" + number2 + "=" +result);
			break;
			
		case '/':
			result=number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" +result);
			break;
			
			default:
				System.out.println("INVALID OPERATOR!");
				break;
		
		}
		input.close();
	}

}
