
public class LengthofLL {
	/*************** 
	 * Following is the Node class already written 
	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public LinkedListNode(T data) {
			this.data = data;
		}
	}
	 ***************/

	public class Solution {

		public static int length(LinkedListNode<Integer> head){
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
			*/
	      int c=0;
		LinkedListNode<Integer>temp=head;
	      while(temp!=null){
	        c++;
	        temp=temp.next;
	      }
		return c;}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
