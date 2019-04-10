package ¶ş·Ö²éÕÒ;

public class Solution1 {
	public static int binarySearch(int[] nums,int target){
		if(nums == null || nums.length == 0) return -1;
		int low = 0;
		int high = nums.length-1;
		int mid = 0;
		while(low <= high){
			mid = (low+high)>>2;
			if(nums[mid] == target){
				return mid;
			}
			if(nums[mid] > target){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return -1;
	}
}
