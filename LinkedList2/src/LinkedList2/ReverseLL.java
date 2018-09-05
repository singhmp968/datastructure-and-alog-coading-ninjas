package LinkedList2;

import java.util.Scanner;
import java.util.Scanner;
public class ReverseLL {
public static Node2<Integer> reverseR(Node2<Integer> head){
	if(head==null || head.next==null) {
		return head;
	}
	Node2<Integer> finalhead=reverseR(head.next);
	Node2<Integer> temp=finalhead;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=head;
	head.next=null;
	return finalhead;
}

	public static Node2<Integer> takeInput()

{
	Node2<Integer> head= null,tail=null;
	Scanner s=new Scanner(System.in);
	int data=s.nextInt();
	while(data !=-1) {
		Node2<Integer> newNode = new Node2<Integer>(data);
		if(head==null) {
			head =newNode;
			tail=newNode;
			
//		}else {
//			Node<Integer> temp=head;
//			while(temp.next !=null) {
//				temp=temp.next;
//			}
		//	temp.next=newNode;
			tail.next=newNode;
			tail=newNode;
		}
		data=s.nextInt();
		
	}
	return head;
}

public static void print(Node2<Integer> head) {
	while(head !=null) {
		System.out.println(head.data +" ");
		head=head.next;
	}

System.out.println();
}

public static void main(String []args) {
	Node2<Integer> head =takeInput();
	print(head);
}

}
