package LeetCode;

import java.util.HashMap;

public class RomanToNumber {
	
	
	public static void main(String[] args) {
		
		System.out.println(convertRoman("IV"));
		System.out.println(convertRoman("VI"));
		System.out.println(convertRoman("V"));
		System.out.println(convertRoman("I"));
		System.out.println(convertRoman("X"));
		System.out.println(convertRoman("XI"));
		System.out.println(convertRoman("IX"));
		
	}
	
	public static int convertRoman(String s) {
		int res = 0;
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		
		for(int i=0;i< s.length();i++) {
			char ch = s.charAt(i);
			int cvalue = m.get(ch);
			
			if(i<s.length()-1 && cvalue < m.get(s.charAt(i+1))) {
				res -= cvalue;
			}else {
				res += cvalue;
			}
			
		}
		
		return res;
	}

}
