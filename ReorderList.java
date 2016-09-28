package iB;

public class ReorderList {
	public static ListNode reverse(ListNode a){
		if(a.next==null) return a;
		ListNode head = a;
		ListNode current = a.next;
		ListNode previous = a;
		ListNode tail = a;
		while(current.next!=null){
			head = current;
			previous.next = current.next;
			current.next = tail;
			tail = current;
			current = previous.next;
		}
		head = current;
		previous.next = null;
		current.next = tail;
		tail = current;
		return head;
	}
 	public static ListNode reorderList(ListNode a) {
		ListNode temp = a;
		while(temp.next!=null){
			temp.next = reverse(temp.next);
			temp = temp.next;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(1);
		ListNode temp2 = new ListNode(2);
		ListNode temp3 = new ListNode(3);
		ListNode temp4 = new ListNode(4);
		ListNode temp5 = new ListNode(5);
		ListNode temp6 = new ListNode(6);
		temp.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp6;
		temp6.next = null;
		ListNode temp7 = reorderList(temp);
		while(temp7!=null){
			System.out.print(temp7.val+"-->");
			temp7 = temp7.next;
		}
	}

}
