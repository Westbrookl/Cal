package 链表中倒数第k个结点;
import java.util.concurrent.*;
import java.util.Stack;

public class Solution {
	
	 public static ListNode FindKthToTail(ListNode head,int k) {
		 if(head == null) return null;
		 ListNode temp = head;
		 Stack<ListNode> stack = new Stack<ListNode>();
		 while(temp != null){
			 stack.push(temp);
			 temp = temp.next;
		 }
		 int i=1;
		 while(!stack.isEmpty()){
			 if(i == k){
				 return stack.pop();
			 }else{		
				 stack.pop();
				 i++;
			 }
		 }
		 return null;
	 }
	 public static void main(String[] args){
		 ListNode l1 = new ListNode(1);
		 ListNode l2 = new ListNode(2);
		 ListNode l3 = new ListNode(3);
		 ListNode l4 = new ListNode(4);
		 ListNode l5 = new ListNode(5);
		 ListNode l6 = new ListNode(6);
		 l1.next = l2;
		 l2.next = l3;
		 l3.next = l4;
		 l4.next = l5;
		 l5.next = l6;
		 l6.next = null;
		 ListNode result = FindKthToTail(l1,3);
		 System.out.println(result.val);
		
	 }
}
