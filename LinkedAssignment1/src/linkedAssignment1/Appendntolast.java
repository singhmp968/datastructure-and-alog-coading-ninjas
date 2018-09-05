package linkedAssignment1;

public class Appendntolast {

	/*
	class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.setData(data);
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

	}
	* */
	public class Solution {
		public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {

	 LinkedListNode<Integer>temp1=root;
			LinkedListNode<Integer>temp2=root;
			int length=LengthIterative(root);
			int i=0;
			while(i<length-n-1)
			{
				temp1=temp1.next;
				i++;
			}
			root=temp1.next;
			temp1.next=null;
			LinkedListNode<Integer>tempHead=root;
			while(tempHead.next!=null)
			{
				tempHead=tempHead.next;
			}
			tempHead.next=temp2;
			return root;
	}
	   public static int LengthIterative(LinkedListNode<Integer>head){
			int count=0;
			while(head!=null)
			{
				count++;
				head=head.next;
			}
			return count;
	   }
	}
	  

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
