package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the String: ");
		String st = s.nextLine();
		
		Map<Character, Integer> m = new HashMap<Character,Integer>();
		
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			
			if(m.containsKey(ch)) {
				m.put(ch, m.get(ch)+1);
			}else {
				m.put(ch, 1);
			}
		}
		
		m.forEach((key, value)-> System.out.println(key+" - "+value));
		
	}

}
