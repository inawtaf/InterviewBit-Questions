package iB;

public class ListCycle {
	public static ListNode detectCycle(ListNode a) {
		if(a.next==null) return null;
		if(a.next==a) return a;
		ListNode temp = a;
		ListNode temp2 = a;
		boolean flag = true;
		while(flag||temp!=temp2){
			System.out.println("Loop 1");
			if(temp.next==null) return null;
			temp=temp.next;
			if(temp2.next==null||temp2.next.next==null) return null;
			temp2=temp2.next.next;
			flag = false;
		}
		temp = a;
		while(temp!=temp2){
			System.out.println("Loop 2");
			temp = temp.next;
			temp2 = temp2.next; 
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(1);
		ListNode temp2 = new ListNode(2);
		ListNode temp3 = new ListNode(3);
		ListNode temp4 = new ListNode(4);
		ListNode temp5 = new ListNode(5);
//		ListNode temp6 = new ListNode(6);
		temp.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;
		temp5.next = temp3;
//		temp6.next = null;
		ListNode temp7 = detectCycle(temp);
		System.out.print(temp7.val+"-->");
//		while(temp7!=null){
//			System.out.print(temp7.val+"-->");
//			temp7 = temp7.next;
//		}
	}

}
