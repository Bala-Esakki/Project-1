package basic;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateNormal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the limit : ");
		int limit = s.nextInt();
		
		int a1[] = new int[limit];
		
		for(int i=0;i<a1.length;i++) {
			System.out.print("Enter the "+(i+1)+" value : ");
			a1[i] = s.nextInt();
		}
		
		Arrays.sort(a1);
		
		int a2[] = new int[limit];
		
		int count = 0;
		
		for(int i=0;i<a1.length;i++) {
			int cc =0;
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j])
					cc++;
			}
			if(cc==0) {
				a2[count++] = a1[i];
			}
		}
		
		int res[] = new int[count];
		
		for(int i=0;i<res.length;i++) {
			res[i] = a2[i];
		}
		
		System.out.println(Arrays.toString(res));
		
	}
}
