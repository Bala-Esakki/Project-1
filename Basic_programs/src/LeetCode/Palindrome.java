package LeetCode;

public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println(checkPalindrome(10));
		
	}
	
	public static boolean checkPalindrome(int n) {
		int num = n;
		int prod = 0;
		
		while(num>0) {
			int last = num%10;
			prod = prod*10+last;
			num/=10;
		}
		
		boolean res = true;
		
		if(n==0) {
			return res;
		}else if(n>0){
			if(n==prod) {
				res = true;
				return res;
			}else {
				res = false;
				return res;
			}
		}else {
			res = false;
			return res;
		}
		
		
		
	}

}
