package lab_numbers;
import java.util.Scanner;
public class AreaTriangleDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter the width of the triangle:");
		double base= scan.nextDouble();
		
		System.out.println("enter the height of the triangle:");
		double height= scan.nextDouble();
		
		double area = (base*height)/2;
		System.out.println("Area of Triangle is :"+area);
		
	}

}
