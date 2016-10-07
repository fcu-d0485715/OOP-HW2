import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		int no1;
		float no2;
		String no3;
		float no4;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		no1 = scanner.nextInt();
		
		System.out.println("Enter a float point number:");
		no2 = scanner.nextFloat();
		
		System.out.println("Enter a you name:");
		no3 = scanner.next();
		
		no4 = no1*no2 ;
		
		
		System.out.printf("Hi "+ no1 + ", the multiplication of "+ no2+ " and "+ no3 + " is "+ "%e", no4 );
		 
		
		// TODO Auto-generated method stub

	}

}
