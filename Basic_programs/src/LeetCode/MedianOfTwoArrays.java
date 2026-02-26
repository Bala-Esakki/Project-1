package LeetCode;

public class MedianOfTwoArrays {

	
	public static double sortArray(int a[], int b[]) {
		int res[] = new int[a.length+b.length];
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			res[count++] = a[i];
		}
		for(int j=0;j<b.length;j++) {
			res[count++] = b[j];
		}
		
		
		double median;
		int len = res.length;
		
		if(len%2==0) {
			median = (res[len/2-1] + res[len/2])/2.0;
		}else {
			median = res[len/2];
		}
		
		return median;
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2};
		int b[] = {3,4};
		
		System.out.println(sortArray(a,b));
		
	}


}
