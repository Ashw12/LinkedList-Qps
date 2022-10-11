package Lecture37_Linkedlist_Qps;

import Lecture37_Linkedlist_Qps.Middle_Of_The_Linkedlist.ListNode;

public class Intersecction_Of_Two_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 class ListNode {
			     int val;
			     ListNode next;
			    ListNode(int x) {
			         val = x;
		        next = null;
			   }
		 }
			 
			class Solution {
			    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			        ListNode A = headA;
			        ListNode B =headB;
			    
			    while(A!=B) {
			    	if(A==null) {
			    		A=headB;
			    	}
			    	else {
			    		A=A.next;
			    	}
			        if(B==null) {
			        	B=headA;
			        }else {
			        	B=B.next;
			        }
			    }
			    return A;
			    }
			}
	}
}
