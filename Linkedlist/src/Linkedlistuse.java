
public class Linkedlistuse  {

	public static Node<Integer> takeInput()
	public static void print(Node<Integer> head) 
		public static Node<Integer> insert(Node<Integer> head,int data,int pos)
	
	Node<Integer> newNode =new Node<Integer>(data);
	if(pos==0) {
		newNode.next=head;
head=newNode;
		return newNode;
	}
	
	int i=0;
		Node<Integer> temp=head;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp=newNode;
		newNode=temp;
return head;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Node<Integer> head = takeInput();
 insert(head,80,3); 
 print(head);
	}

}
