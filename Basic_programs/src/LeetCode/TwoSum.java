package LeetCode;

import java.util.Arrays;

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]

public class TwoSum {
	
	public static int[] twoSum(int a[], int target) {
		int res[] = new int [2];
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j] == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int a[] = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(a,target)));
		
	}

}
