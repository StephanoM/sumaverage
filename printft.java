import java.util.Scanner;
public class printft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		double n1,n2,n3,n4,n5;
		
				
		System.out.println("Enter the first number: ");
		n1 = keyboard.nextDouble();
		
		System.out.println("Enter the second number: ");
		n2 = keyboard.nextDouble();
		
		System.out.println("Enter the third number: ");
		n3 = keyboard.nextDouble();
		
		System.out.println("Enter the fourth number: ");
		n4 = keyboard.nextDouble();
		
		System.out.println("Enter the fith number: ");
		n5 = keyboard.nextDouble();
		
		double sum = n1+n2+n3+n4+n5;
		double avg = sum/5;
		
		System.out.println("The sum of all numbers is " + sum);
		System.out.println("The avg of all numbers is " + avg);
		
	}

}



