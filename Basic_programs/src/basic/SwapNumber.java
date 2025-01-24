package basic;

import java.util.Scanner;

public class SwapNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the Number-1 : ");
		int n1 = s.nextInt();
		
		System.out.print("Enter the Number-2 : ");
		int n2 = s.nextInt();
		
		System.out.println("Before Swapping\nN1 = "+n1+"\nN2 = "+n2);
		
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		
		System.out.println("After Swapping\nN1 = "+n1+"\nN2 = "+n2);
	}

}
