package basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Flames {
	
	public static String removeSpace(String s) {
		String res = "" ;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=32) {
				res+=s.charAt(i);				
			}
		}
		res = res.toUpperCase();
		return res;
	}
	
	public static List<Character> addNameList(String s){
		List<Character> name = new LinkedList<Character>();
		
		for(int i=0;i<s.length();i++) {
			name.add(s.charAt(i));
		}
		return name;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name1 = s.nextLine();
		
		System.out.print("Enter your Partner name : ");
		String name2 = s.nextLine();
		
		String n1 = removeSpace(name1);
		String n2 = removeSpace(name2);
		
//		System.out.println("Your Name : "+n1);
//		System.out.println("Your Partner Name : "+n2);
		
		List<Character> a1 = addNameList(n1);
		List<Character> a2 = addNameList(n2);
		
//		System.out.println(a1);
//		System.out.println(a2);
		
		for(int i=0;i<a1.size();i++) {
			for(int j=0;j<a2.size();j++) {
				if(a1.get(i).equals(a2.get(j))) {
					a1.remove(i);
					a2.remove(j);
					break;
				}
			}
		}
		
		List<Character> bname = new LinkedList<Character>();
		bname.addAll(a1);
		bname.addAll(a2);
		
		
		int size = bname.size();
		
		List<Character> flames = new ArrayList<Character>();
		
		String f = "FLAMES";
		
		for(int i=0;i<f.length();i++) {
			flames.add(f.charAt(i));
		}
		
		
		
		int index = 0;
		
		while (flames.size() > 1) {
            // Count the number of people to eliminate based on size of the name
            index = (index + size - 1) % flames.size();
            flames.remove(index);
        }
		
		char Final = flames.getFirst();
		
//		System.out.println(Final);
		System.out.println();
		
		switch(Final) {
		case 'F': System.out.println(name1+" and "+name2+" both are Friends...");
		break;
		case 'L': System.out.println(name1+" and "+name2+" both are Lovers...");
		break;
		case 'A': System.out.println(name1+" and "+name2+" both Affection to each other...");
		break;
		case 'M': System.out.println(name1+" and "+name2+" both are getting Married Soon...");
		break;
		case 'E': System.out.println(name1+" and "+name2+" both are Enemies...");
		break;
		case 'S': System.out.println(name1+" and "+name2+" both are Bothers and sisters...");
		break;
		default: System.out.println("Error 404 not found...");
		}
		
		
		
	}

}
