package iB;

public class RemoveDuplicatesFRomSortedListII {
	public static ListNode deleteDuplicates(ListNode a) {
		if(a.next==null) return a;
		ListNode temp = a;
		ListNode modiHead = null;
		ListNode modi = modiHead;
		int latest = Integer.MIN_VALUE;
		while(temp!=null){
//			System.out.println("E1: Temp = "+temp.val+" "+temp);
			while(temp.next!=null&&temp.val!=temp.next.val){
				ListNode another = new ListNode(0);
				another.val=temp.val;
//				System.out.println("Another: "+another.val);
				if(modi==null){
					modi=another;
					modiHead=modi;
				}
				else{
					modi.next = another;
					modi = modi.next;
				}
			    temp=temp.next;
			}
//			System.out.println("E2: Temp = "+temp.val+" "+temp);
			while(temp.next!=null&&temp.val==temp.next.val){
				latest = temp.val;
				temp = temp.next;
			}
			if(temp.next==null&&modi==null){
				ListNode another = new ListNode(0);
				another.val=temp.val;
				modi=another;
				modiHead=modi;
			}
			else if(temp.next==null&&latest!=temp.val){
				ListNode another = new ListNode(0);
				another.val=temp.val;
				modi.next = another;
				modi = modi.next;
			}
//			System.out.println("E3: Temp = "+temp.val+" "+temp);
			if(temp.next==null) break;
			temp = temp.next;
		}
		if(modi!=null) modi.next=null;
		if(modiHead.next==null) return null;
		return modiHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(1);
		ListNode temp2 = new ListNode(1);
		ListNode temp3 = new ListNode(1);
		ListNode temp4 = new ListNode(6);
		ListNode temp5 = new ListNode(9);
		ListNode temp6 = new ListNode(9);
		ListNode temp7 = new ListNode(17);
//		ListNode temp8 = new ListNode(18);
		ListNode temp9 = new ListNode(19);
		temp.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		temp4.next=temp5;
		temp5.next=temp6;
		temp6.next=temp7;
		temp7.next=temp9;
//		temp8.next=temp9;
		temp9.next=null;
		System.out.println(deleteDuplicates(temp).next.next.val);
	}

}
