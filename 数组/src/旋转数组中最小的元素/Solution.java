package 旋转数组中最小的元素;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，
 * 输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 * 该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * @author jhc
 * 
 * 对于二分查找，如果是left = mid+1 right = mid-1 循环的判断条件是while(left <= right)
 * 如果是 left = mid right= mid-1 循环的判断条件是while(left < right)
 *
 */
public class Solution {
    public static int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0) return 0;
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while(array[left] > array[right]){
        	if(right - left == 1){
        		mid = right;
        		break;
        	}
        	mid = (left+right)/2;
        	if(array[mid] == array[right] && array[left] == array[mid]){
        		mid = inOrder(array,left,right);
        	}

        	if(array[mid] >= array[left]){
        		left = mid;
        	}else if(array[mid] <= array[right]){
        		right = mid;
        	}
        }
        return array[mid];
    }
    public static int inOrder(int[] array,int left,int right){
    	int result = array[left];
    	for(int i=left+1;i<=right;i++){
    		if(result > array[i]){
    			result = array[i];
    		}
    	}
    	return result;
    }
}
