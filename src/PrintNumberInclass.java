import java.util.Scanner;

public class PrintNumberInclass {

	public static void main(String[] args) {
		
		int X;
		
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		X = scanner.nextInt();
		
		if (X==1)
			System.out.printf("The input integer is ¡§ONE¡¨.");
			
		if (X==2)
			System.out.printf("The input integer is ¡§TWO¡¨.");

		if (X==3)
			System.out.printf("The input integer is ¡§THREE¡¨.");

		if (X==4)
			System.out.printf("The input integer is ¡§FOUR¡¨.");	

		if (X==5)
			System.out.printf("The input integer is ¡§FIVE¡¨.");

		if (X==6)
			System.out.printf("The input integer is ¡§SIX¡¨.");

		if (X==7)
			System.out.printf("The input integer is ¡§SEVEN¡¨.");

		if (X==8)
			System.out.printf("The input integer is ¡§EIGHT¡¨.");

		if (X==9)
			System.out.printf("The input integer is ¡§NINE¡¨.");
		
		if(X<1)
			System.out.printf("The input integer is ¡§OTHER¡¨.");
		if(X>9)
			System.out.printf("The input integer is ¡§OTHER¡¨.");
		
			
		// TODO Auto-generated method stub

	}

}
