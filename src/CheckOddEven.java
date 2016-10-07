import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		int a;
		
		System.out.println("Enter a integer:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		
		if (a%2 > 0)
		System.out.printf("Odd Number");
		
		else 
		System.out.printf("Even Number");
		
		// TODO Auto-generated method stub

	}

}
