package basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
	
	static Scanner s = new Scanner(System.in);
	
	public static List fibonacciSeries(int n) {
		List<Integer> fs = new LinkedList<Integer>();
		
		int n1 = 0;
		int n2 = 1;
		
		fs.add(n1);
		fs.add(n2);
		
		int n3 ;
		
		for(int i=2;i<n;i++) {
			n3 = n1+n2;
			fs.add(n3);
			n1 = n2;
			n2 = n3;
		}
		
		return fs;
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the limit : ");
		int limit = s.nextInt();
		
		List<Integer> ls = fibonacciSeries(limit);
		
		for(Integer i: ls) {
			System.out.print(i+" ");
		}
	}


}
