package iB;

public class AddTwoNumbersAsList {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		if(a==null) return b;
		if(b==null) return a;
		int num = b.val + a.val;
		int carry = num/10;
		a = a.next;
		b = b.next;
		num = num%10;
		ListNode head = new ListNode(num);
		ListNode temp = head;
		while(a.next!=null&&b.next!=null){
			num = b.val + a.val + carry;
			carry = num/10;
			num = num % 10;
			ListNode another = new ListNode(num);
			temp.next = another;
			temp = temp.next;
			a = a.next;
			b = b.next;
		}
		while(a.next!=null){
			num = a.val + carry;
			carry = num/10;
			num = num % 10;
			ListNode another = new ListNode(num);
			temp.next = another;
			temp = temp.next;
			a = a.next;
		}
		while(b.next!=null){
			num = b.val + carry;
			carry = num/10;
			num = num % 10;
			ListNode another = new ListNode(num);
			temp.next = another;
			temp = temp.next;
			b = b.next;
		}
		if(carry!=0){
			ListNode another = new ListNode(carry);
			temp.next = another;
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
