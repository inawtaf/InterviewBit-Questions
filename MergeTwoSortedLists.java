package iB;

public class MergeTwoSortedLists {
	public static ListNode mergeTwoLists(ListNode a, ListNode b) {
		if(a==null) return b;
		if(b==null) return a;
		ListNode A = a;
		ListNode B = b;
		int min = a.val < b.val ? a.val : b.val;
		if(a.val<b.val) A = A.next;
		else B = B.next;
		ListNode head = new ListNode(min);
		ListNode tail = head;
		while(A!=null&&B!=null){
			ListNode another = new ListNode(0);
			if(A.val<B.val){
				another.val = A.val;
				A = A.next;
			}
			else{
				another.val = B.val;
				B = B.next;
			}
			tail.next = another;
			tail = tail.next;
		}
		while(A!=null){
			ListNode another = new ListNode(0);
			another.val = A.val;
			A = A.next;
			tail.next = another;
			tail = tail.next;
		}
		while(B!=null){
			ListNode another = new ListNode(0);
			another.val = B.val;
			B = B.next;
			tail.next = another;
			tail = tail.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(1);
		ListNode temp2 = new ListNode(5);
		ListNode temp3 = new ListNode(8);
		ListNode temp4 = new ListNode(4);
		ListNode temp5 = new ListNode(11);
		ListNode temp6 = new ListNode(15);
		temp.next = temp2;
		temp2.next = temp3;
		temp4.next = temp5;
		temp5.next = temp6;
		ListNode temp7 = mergeTwoLists(temp,temp4);
		while(temp7!=null){
			System.out.print(temp7.val+"-->");
			temp7 = temp7.next;
		}
	}

}
