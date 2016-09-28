package iB;

public class Substract {
	public ListNode subtract(ListNode a){
		if(a.next==null) return a;
		ListNode prev;
		prev = a;
		int i = 1;
		while(prev.next!=null){
			prev = prev.next;
			i++;
		}
		int max = i/2;
		ListNode temp = a;
		temp.val = prev.val - temp.val;
		prev = temp;
		ListNode head = temp;
		int point = 2;
		temp = temp.next;
		while(point<=max){
			point++;
			temp.val = prev.val - temp.val;
			prev = prev.next;
			temp = temp.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
