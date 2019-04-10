package _2两数之和;

import java.util.ArrayList;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       if(l1 == null && l2 == null) return null;
       int temp1 = 0;
       int temp2 = 0;
       int k=0;
       int j=0;
       while(l1!=null){
    	   
    	   temp1 += l1.val*Math.pow(10,k);
    	   k++;
    	   l1 = l1.next;
       }
       while(l2 != null){
    	   temp2 += l2.val *Math.pow(10,j);
    	   j++;
    	   l2 = l2.next;
       }
       int temp3 = temp1 + temp2;
       String re = String.valueOf(temp3);
       ListNode result = new ListNode(Integer.valueOf(re.charAt(re.length()-1)-'0'));
       ListNode temp = result;
       for(int i= re.length()-2;i>=0;i--){
    	   temp.next = new ListNode(Integer.valueOf(re.charAt(i)-'0'));
    	   temp = temp.next;
       }
       temp.next = null;
       return result;
    }
    public static void main(String[] args){
    	ListNode l1 = new ListNode(1);
    	ListNode l2 = new ListNode(8);
//    	ListNode l3 = new ListNode(3);
    	l1.next = l2;
    	l2.next = null;
//    	l3.next = null;
    	ListNode l4 = new ListNode(0);
//    	ListNode l5 = new ListNode(6);
//    	ListNode l6 = new ListNode(4);
    	l4.next = null;
//    	l5.next = l6;
//    	l6.next = null;
    	ListNode result = addTwoNumbers(l1,l4);
    	while(result!=null){
    		System.out.println(result.val);
    		result = result.next;
    	}
    	
    }
}
