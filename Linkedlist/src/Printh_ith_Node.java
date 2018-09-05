
public class Printh_ith_Node {
	/*************** 
	 * Following is the Node class already written 
	class LinkedListNode<T> {
		T data;
		LinkedListNode<T> next;

		public Node(T data) {
			this.data = data;
		}
	}
	 ***************/

	public class Solution {

		public static void printIth(LinkedListNode<Integer> head, int i){
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Print output and don't return it.
		 	 * Taking input is handled automatically.
			*/
		LinkedListNode<Integer> temp=head;
	   int c=0;
	      while(temp!=null){
	        if(c==i){
	          System.out.println(temp.data);
	     
	        return;
	        }
	        c++;
	      
	      temp=temp.next;
	      }
	        }
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
