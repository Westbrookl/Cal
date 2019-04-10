package 旋转数组中最小的元素;
/**
 * 
 * @author jhc
 *
 */
public class Solution1 {
	public static int minNumberInRotateArray(int [] array) {
		if(array == null || array.length == 0) return 0;
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while(array[low] >= array[high]){
			if(high - low <= 1){
				mid = high;
				break;
			}
			mid = (low+high)>>1;
			if(array[mid] == array[high] && array[mid] == array[low]){
				return inOrderSearch(array,low,high);
			}
			if(array[mid] >= array[low]){
				low = mid;
			}else if(array[mid] <= array[high]){
				high = mid;
			}
		}
		return array[mid];
	}
	public static int inOrderSearch(int[] array,int low,int high){
		int re = array[low];
		for(int i=low+1;i<=high;i++){
			if(array[i] > re){
				re = array[i];
			}
		}
		return re;
	}
	public static void main(String[] args){
		int[] nums = {3,4,5,1,2};
		int re = minNumberInRotateArray(nums);
		System.out.println(re);
	}
}
