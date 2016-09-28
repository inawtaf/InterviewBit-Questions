package iB;

public class PalindromeList {
	public static int lPalin(ListNode A) {
        if(A.next==null) return 1;
        ListNode temp = A;
        int size = 1;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        temp=A;
        int x=0;
        boolean flag=false;
        if(size%2!=0){
            size++;
            flag=true;
        }
        ListNode current = A.next;
        ListNode previous = A;
        ListNode head = A;
        while(x<(size/2)-1){
            x++;
//            System.out.println(x);
//            System.out.println(current.val);
//            System.out.println(previous.val);
//            System.out.println(head.val);
            previous.next=current.next;
            current.next=head;
            head=current;
            current=previous.next;
//            System.out.println();
        }
//        System.out.println(current.val);
//        System.out.println(previous.val);
//        System.out.println(head.val);
//        System.out.println();
        ListNode temp2=current;
        if(!flag) temp=head;
        else temp = head.next;
        while(temp2!=null&&temp!=null){
            if(temp.val!=temp2.val){
            	//System.out.println("temp = "+temp.val+" temp2 = "+temp2.val);
            	return 0;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode temp = new ListNode(1);
		ListNode temp2 = new ListNode(2);
		ListNode temp3 = new ListNode(2);
		ListNode temp4 = new ListNode(1);
		temp.next=temp2;
		temp2.next=temp3;
		temp3.next=temp4;
		temp4.next=null;
		System.out.println(lPalin(temp));
	}

}
