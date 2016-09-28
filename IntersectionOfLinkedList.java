package iB;

public class IntersectionOfLinkedList {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
		ListNode temp = a;
		ListNode pointer = b;
		while(temp!=null){
			while(pointer!=null){
				if(temp==pointer) return temp;
				pointer=pointer.next;
			}
			temp=temp.next;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
