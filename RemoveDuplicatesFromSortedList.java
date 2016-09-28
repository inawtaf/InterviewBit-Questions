package iB;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode a) {
		if(a.next==null) return a;
		ListNode A = a;
		ListNode head = new ListNode(a.val);
		while(A.next!=null&&A.next.val==A.val) A = A.next;
		if(A.next==null){
			if(A.val!=head.val){
				head.next = A;
			}
			return head;
		}
		ListNode tail = head;
		while(A!=null){
			ListNode another = new ListNode(A.val);
			tail.next = another;
			tail = tail.next;
			while(A.next!=null&&A.next.val==A.val) A = A.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
