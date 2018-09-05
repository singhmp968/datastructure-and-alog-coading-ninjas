package LinkedList2;

public class ReverseLl3 {
public static Node<Integer> ResverseLL(node<integer> head){
	if(head==null || head.next==null) {
		return head;
	}
	Node<Integer> reversedTail=head.next;
	Node<Integer> smallAns=ReverseLL(head.next);
	reverseTail.next=head;
	head.next=null;
	return smallAns;
	// tommorew portion complete
}
}
