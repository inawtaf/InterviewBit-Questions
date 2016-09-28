package iB;

public class ReorderList2 {
	public static ListNode fetch(ListNode a, ListNode tail){
		while(a.next!=tail) a= a.next;
		return a;
	}
	public static ListNode reorderList(ListNode a) {
		ListNode temp = a;
		ListNode tail;
		while(temp.next!=null) temp = temp.next;
		tail = temp;
		temp = a;
		while(temp.next!=null&&temp!=tail){
			tail.next = temp.next;
			temp.next = tail;
			temp = tail.next;
//			System.out.println("temp = "+temp.val+" tail = "+tail.val);
			tail = fetch(temp,tail);
			tail.next = null;
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
