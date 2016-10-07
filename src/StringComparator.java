import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		
		String A,B;
		
		 
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string 1");
		A = scanner.next();
		
		System.out.println("Enter a string 2");
		B = scanner.next();
		
		System.out.println(A + B +String.valueOf( A.equalsIgnoreCase(B)) );
		
		boolean C;
		
		C=A.equalsIgnoreCase(B);
		
		if(C)
		
			System.out.printf("The two strings are the same.");
		
		else
		
			System.out.printf("The two strings are not the same.");
		
		// TODO Auto-generated method stub

	}

}
