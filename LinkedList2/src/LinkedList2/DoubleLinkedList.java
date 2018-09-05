package LinkedList2;
import java.util.Scanner;
public class DoubleLinkedList {

	public static doubleNode reverseLLBetter(Node<Integer> head) {
		
		if(head==null||head.next==null) {
			
			doubleNode ans=new doubleNode();//creating two object to return two value of the class
			
			ans.head=head;
			ans.tail=head;
			return ans;
		}
	doubleNode smallAns=reverseLLBetter(head.next);
	smallAns.tail.next=head;
	head.next=null;
	doubleNode ans=new doubleNode();
	ans.head=smallAns.head;
	ans.tail=head;
	
	}
	public static Node<Integer> takeInput(){
		{
			Node<Integer> head = null, tail = null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();
					
			while(data != -1){
				Node<Integer> newNode = new Node<Integer>(data);
				if(head == null){
					head = newNode;
					tail = newNode;
				}else{
//					Node<Integer> temp = head;
//					while(temp.next != null){
//						temp = temp.next;
//					}
//					temp.next = newNode;
					tail.next = newNode;
					tail = newNode; // tail = tail.next
				}
				data = s.nextInt();
			}
			return head;
		}

		public static void print(Node<Integer> head){
			
			while(head != null){
				System.out.print(head.data +" ");
				head = head.next;
			}
			System.out.println();

		}


		
	}

	
	public static void main(String args[]) {
		Node<Integer> head=takeInput();
		doubleNode ans=reverseLLBetter(head);
		print(ans.head);
	}
}
