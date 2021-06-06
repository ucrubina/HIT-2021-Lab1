package lab_numbers;
import java.util.Scanner;
public class SquareAreaDemo {

	public static void main(String[] args) {
		System.out.println("Enter sides of the square");
		Scanner scanner= new Scanner(System.in);
		double side = scanner.nextDouble();
		double area = side*side;
		System.out.println("Area of square is:"+area);
	}

}
