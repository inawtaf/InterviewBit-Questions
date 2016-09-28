package iB;

public class RotateList {
	public ListNode rotateRight(ListNode a, int b) {
		ListNode temp = a;
		int size = 1;
		ListNode head = temp;
		while(temp.next!=null){
			temp = temp.next;
			size++;
		}
		if(b>size){
		    b=b%size;
		}
		ListNode tail = temp;
		int i = 0;
		while(i<size-b){
			tail.next = head;
			head = head.next;
			tail = tail.next;
			i++;
		}
		tail.next = null;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
