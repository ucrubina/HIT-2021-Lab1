package lab_numbers;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		int no=0, reverseno=0;
		System.out.println("Input ur no and press enter:");
		Scanner in= new Scanner(System.in);
		no=in112.nextInt();
		while(no !=0)
		{
			reverseno = reverseno*10;
			reverseno = reverseno+no%10;
			no=no/10;
		}
		System.out.println("Reverse of input number is:"+reverseno);
				}

}
