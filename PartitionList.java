package iB;

public class PartitionList {
	public static ListNode partition(ListNode a, int b) {
		if(a.next==null) return a;
		ListNode head = a;
		ListNode temp = a;
		while(temp.next!=null) temp = temp.next;
		ListNode tail = temp;
		ListNode previous = a;
		temp = a;
		boolean flag = false;
		if(temp.val>=b){
			tail.next = temp;
			tail = temp;
			tail.next = null;
			flag = true;
		}
		temp = a.next;
		if(flag) head = temp;
		else head = a;
		ListNode start = new ListNode(0);
		ListNode end = new ListNode(0);
		while(temp.next!=null){
			while(temp.next!=null&&temp.val<b){
				System.out.println("!");
				previous = temp;
				temp = temp.next;
				flag = false;
			}
			if(temp.next==null) return head;
			start = temp;
			while(temp.next!=null&&temp.val>=b) temp = temp.next;
			end = temp;
			if(temp.next==null) return head;
			if(previous==a){
				if(head!=a) head = end;
				tail.next = start;
				temp = start;
				while(temp.next!=end) temp = temp.next;
				tail = temp;
				temp.next = null;
				temp = head;
			}
			else{
				previous.next = end;
				tail.next = start;
				temp = start;
				while(temp.next!=end) temp = temp.next;
				tail = temp;
				temp.next = null;
				temp = end;
			}
		}
//		if(temp.val<b){
//			temp = temp.next;
//		}
//		else{
//			head = temp.next;
//			tail.next = temp;
//			tail = temp;
//			temp = head.next;
//		}
//		while(temp.next!=null){
////			System.out.println("temp = "+temp.val);
//			if(temp.val<b){
//				previous.next = temp.next;
////				System.out.println("Yes");
//				temp.next = head;
//				head = temp;
//				temp = previous.next;
////				System.out.println(temp.val);
//			}
//			else{
//				while(temp.next!=null&&temp.val>=b){
//					temp = temp.next;
//					previous = previous.next;
//					tail = temp;
//				}
//			}
//			if(temp.next==null&&temp.val<b){
//				previous.next = null;
//				temp.next = head;
//				head = temp;
//				return head;
//			}
//		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {18, 595, 253, 7, 984, 914, 903, 992, 522, 784, 55, 910, 123, 133, 936, 38, 774, 868, 204, 727, 927, 981, 766, 619, 848, 398, 782, 460, 444, 805, 62, 154, 35, 261, 202, 622, 472, 151, 590, 270, 115, 773, 332, 928, 298, 597, 150, 704, 229, 205, 501, 284, 497, 305, 864, 368, 995, 731, 255, 712, 614, 179, 756, 432, 415, 734, 449, 85, 817, 686, 829, 12, 564, 427, 711, 275, 109, 641, 344, 934, 760, 551, 958, 540, 446};
		ListNode temp = new ListNode(array[0]);
		ListNode head = temp;
		for(int i=1;i<array.length;i++){
			ListNode another = new ListNode(array[i]);
			temp.next = another;
			temp = another;
//			System.out.println(temp.val);
		}
		temp = head;
		while(temp!=null){
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
		temp = partition(head,34);
		System.out.println();
//		ListNode temp = new ListNode(1);
//		ListNode temp2 = new ListNode(2);
//		ListNode temp3 = new ListNode(3);
//		ListNode temp4 = new ListNode(4);
//		ListNode temp5 = new ListNode(5);
//		ListNode temp6 = new ListNode(6);
//		temp.next = temp2;
//		temp2.next = temp3;
//		temp3.next = temp4;
//		temp4.next = temp5;
//		temp5.next = null;
//		temp6.next = null;
//		ListNode temp7 = partition(temp, 5);
//		System.out.print(temp7.val+"-->");
		while(temp!=null){
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
	}

}
