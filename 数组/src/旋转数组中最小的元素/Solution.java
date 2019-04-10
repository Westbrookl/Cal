package ��ת��������С��Ԫ��;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���Ǽ�����������һ����ת��
 * �����ת�������СԪ�ء� 
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת��
 * ���������СֵΪ1�� NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author jhc
 * 
 * ���ڶ��ֲ��ң������left = mid+1 right = mid-1 ѭ�����ж�������while(left <= right)
 * ����� left = mid right= mid-1 ѭ�����ж�������while(left < right)
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
