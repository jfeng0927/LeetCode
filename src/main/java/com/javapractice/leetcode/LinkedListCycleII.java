/**
 *
 */
package com.javapractice.leetcode;

/**
 * @author Jianyu Feng
 * https://oj.leetcode.com/problems/linked-list-cycle-ii/
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * Follow up:
 * Can you solve it without using extra space?
 *
 */
public class LinkedListCycleII {
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public ListNode detectCycleOld(ListNode head) {
		if(head!=null) {
			ListNode slow = head;
			ListNode fast = head;

			do {
				slow = slow.next;
				if(fast!=null && fast.next!=null) {
					fast = fast.next.next;
				} else {
					return null;
				}
			} while (slow!=fast);

			slow = head;

			while(slow!=fast) {
				slow = slow.next;
				fast = fast.next;
			}

			return fast;
		}
		return null;
	}

	public ListNode detectCycle(ListNode head) {
		ListNode fast=head, slow=head;

		while (fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast==slow) {
				return findNode(head, slow);
			}
		}

		return null;
	}

	private ListNode findNode(ListNode head, ListNode slow) {
		while (head!=slow) {
			head = head.next;
			slow = slow.next;
		}

		return head;
	}
}
