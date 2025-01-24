package basic;

import java.util.Scanner;

public class ReversestringArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = s.nextLine();
		
		char ch[] = str.toCharArray();
		
		String res = "";
		
		for(int i=ch.length-1;i>=0;i--) {
			res += ch[i];
		}
		System.out.println(res);
	}
}
