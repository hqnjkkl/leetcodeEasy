package leetcodeEasy;
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class MergeTwoSortedList21 {
	static void printLinkList(ListNode l) {
		while(l!=null) {
			System.out.println(l.val);
			l = l.next;
		}
	}
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		printLinkList(l1);
		printLinkList(l2);
		ListNode l = new MergeTwoSortedList21().mergeTwoLists(l1, l2);
		printLinkList(l);
	}
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1==null || l2==null)
    		return l1==null?l2:l1;
    	
    	ListNode h1 = new ListNode(0);
    	ListNode t1=null;
    	if(l1.val<l2.val)
    		h1.next = l1;
    	else
    		h1.next = l2;
    	ListNode h2 = h1;
    	while(l1!=null && l2!=null) {
    		if(l1.val<l2.val) {
    			h2.next = l1;
    			l1 = l1.next;
    		}else {
    			h2.next = l2;
    			l2 = l2.next;
    		}
    		h2 = h2.next;
    	}
    	if(l1!=null) {
    		h2.next = l1;
    	}else {
    		h2.next = l2;
    	}
    	return h1.next;
    }
}
