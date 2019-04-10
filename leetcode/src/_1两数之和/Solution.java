package _1两数之和;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		  int[] result = null;
		  if(nums == null)  return result;
		  for(int i=0;i<nums.length;i++){
		  	for(int j=i;j<nums.length;j++){
		  		if(nums[i]+nums[j] == target){
		  			result = new int[2];
		  			result[0] = i;
		  			result[1] = j;
		  			break;
		  		}
		  	}
		  }
		  return result;
	}
	public static void main(String[] args){
		int[] result = new int[2];
		int[] num1 = {3,3};
		result = twoSum(num1,6);
		for(int i:result){
			System.out.println(i);
		}
	}
}
