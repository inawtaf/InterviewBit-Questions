package iB;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode a, int b) {
		if(a==null||a.next==null) return null;
		ListNode temp = a;
		int size = 1;
		ListNode head = temp;
		while(temp.next!=null){
			temp = temp.next;
			size++;
		}
		if(b>=size){
		    return a.next;
		}
		int i = 1;
		temp = a;
		while(temp.next.next!=null&&i<size-b){
			temp = temp.next;
			i++;
		}
		if(temp.next.next==null){
			temp.next = null;
			return head;
		}
		temp.next = temp.next.next;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
