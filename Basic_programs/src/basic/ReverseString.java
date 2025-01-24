package basic;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = s.nextLine();
		
		String res = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			res += c;
		}
		
		System.out.println(res);
	}

}
