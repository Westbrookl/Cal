package 从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;
public class Solution {
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(listNode == null) return list ;
		Stack<Integer> s1 = new Stack<>();
		ListNode temp = listNode ;
		while(temp != null){
			s1.push(temp.val);
			temp = temp.next;
		}
		while(!s1.isEmpty()){
			list.add(s1.pop());
		}
		return list;
	}
}
