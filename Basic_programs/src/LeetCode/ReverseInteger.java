package LeetCode;

//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		System.out.println(reverint(1534236469));
		
	}

	public static int reverint(int n) {
		long res =0;
		
		if(n<0) {
			while(n<0) {
				int last = n%10;
				res = res*10+last;
				n/=10;
			}
		}
		
		while(n>0) {
			int last = n%10;
			res = res*10+last;
			n/=10;
		}
		
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
			return 0;
		}
		
		
		return (int)res;
	}
}
