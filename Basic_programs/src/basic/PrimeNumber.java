package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		
		int limit = s.nextInt();
		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		
		for(int i=1;i<=limit;i++) {
			if(i==0|| i==1) {
				m.put(i, "Composite Number");
			}
			else if(isPrime(i)) {
				m.put(i, "Prime Number");
			}else {
				m.put(i, "not prime number");
			}
		}
		
		m.forEach((key,value)-> System.out.println(key+" - "+value));
		
	}
	
	public static boolean isPrime(int n) {
		boolean res = true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				res = false;
				return res;
			}
		}
		
		
		return res;
	}

}
