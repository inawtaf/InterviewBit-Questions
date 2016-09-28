package iB;

public class ReverseLinkListII {
	public static ListNode reverseBetween(ListNode a, int m, int n) {
		if(a.next==null) return a;
		int i = 1;
		ListNode temp = a;
		ListNode head = a;
		if(i>m-1){
			//B = a
			ListNode B = a;
			while(i<n){
				i++;
				temp=temp.next;
			}
			ListNode C = temp;
			ListNode D = temp.next;
			if(B==C) return a;
			temp = a;
			while(temp!=B) temp = temp.next;
			temp = B.next;
			B.next = D;
			ListNode next;
			while(temp!=C){
				next = temp.next;
				temp.next = B;
				B = temp;
				temp = next;
				head = next;
			}
			temp.next = B;
			return head;
		}
		while(i<m-1){
			temp = temp.next;
			i++;
		}
		ListNode A = temp;
		ListNode B = temp.next;
		while(i<n){
			i++;
			temp=temp.next;
		}
		ListNode C = temp;
		if(B==C) return a;
		ListNode D = temp.next;
		temp = a;
		while(temp!=B) temp = temp.next;
		temp = B.next;
		B.next = D;
		A.next = C;
		A = A.next;
		ListNode next;
		while(temp!=C){
			next = temp.next;
			temp.next = B;
			B = temp;
			temp = next;
		}
		temp.next = B;
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
		ListNode temp7 = reverseBetween(temp,2,3);
		while(temp7!=null){
			System.out.print(temp7.val+"-->");
			temp7 = temp7.next;
		}
	}

}
