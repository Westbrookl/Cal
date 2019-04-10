package Ѱ���ظ���;
/**
 * 
 * @author jhc
 *
 */
public class Solution1 {
	public static int  findDuplicate(int[] arr){
		if(arr == null || arr.length == 0) return -1;
		int low = 1;
		int high = arr.length - 1;
		while(low < high){
			int mid = (low+high)>>2;
			int count = 0;
			for(int i : arr){
				if(i <= mid) count++;
			}
			if(count <= mid){
				low = mid+1;
			}else{
				high = mid;
			}
		}
		return low;
	}
}
