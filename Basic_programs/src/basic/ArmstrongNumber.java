package basic;

import java.util.Scanner;

public class ArmstrongNumber {
	static Scanner s = new Scanner(System.in);
	
	static int count = 0;
	
	public static int count(int n) {
		int num = n;
		
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	
	public static boolean Armstrong(int num) {
		int n = num;
		int c = count(n);
		
		int sum = 0;
		
		boolean result ;
		
		while(n>0) {
			int last = n%10;
			int prod = 1;
			for(int i=0;i<c;i++) {
				prod*=last;
			}
			n/=10;
			sum+=prod;
		}
		
		if(sum==num) 
			result = true;
		else
			result = false;
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		if(Armstrong(n))
			System.out.println(n+" is a Armstrong Number...");
		else
			System.out.println(n+" is not a Armstrong Number...");
	}
}
