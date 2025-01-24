package basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+(i+1)+"-value : ");
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		TreeSet<Integer> ts = new TreeSet();
		
		for(Integer a : arr) {
			ts.add(a);
		}
		
		System.out.println(ts);
	}
}
