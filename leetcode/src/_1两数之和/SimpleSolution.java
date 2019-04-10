package _1����֮��;
/**
 * �����Ҫ��¼������Ϣ�Ļ������������е�λ���Լ���Ӧλ�õĴ�С
 * ������HashMap
 */
import java.util.HashMap;

public class SimpleSolution {
	public static int[] twoSum(int[] nums,int target){
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int temp = target - nums[i];
			if(map.containsKey(temp)){
				return new int[]{i,map.get(temp)};
			}else{
				map.put(nums[i], i);
			}
		}
		return null;
	}
	public static void main(String[] args){
		int[] result = new int[2];
		int[] num1 = {2, 7, 11, 15};
		result = twoSum(num1,9);
		for(int i:result){
			System.out.println(i);
		}
	}
}
