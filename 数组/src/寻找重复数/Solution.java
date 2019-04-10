package 寻找重复数;
/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
 * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * @author jhc
 *	说明：

	不能更改原数组（假设数组是只读的）。
	只能使用额外的 O(1) 的空间。
	时间复杂度小于 O(n2) 。
	数组中只有一个重复的数字，但它可能不止重复出现一次。
 */
public class Solution {
	public static int findDuplicate(int[] nums){
		if(nums == null || nums.length == 0) return -1;
		int left = 1;
		int right = nums.length-1;
//		int mid = 0;
		while(left < right){
			int mid = (left+right)/2;
			int count = 0;
			for(int num:nums){
				if(num<=mid) count++;
			}
			if(count <= mid){
				left = mid+1;
			}else{
				right = mid;
			}
		}
		return left;
	}
	public static void main(String[] args){
		int[] nums = {1,3,4,2,2};
		int re = findDuplicate(nums);
		System.out.println(re);
	}
}
